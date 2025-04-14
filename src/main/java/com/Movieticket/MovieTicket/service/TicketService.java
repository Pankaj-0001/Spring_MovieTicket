package com.Movieticket.MovieTicket.service;

import com.Movieticket.MovieTicket.dto.TicketDTO;
import com.Movieticket.MovieTicket.model.Show;
import com.Movieticket.MovieTicket.model.ShowSeat;
import com.Movieticket.MovieTicket.model.Ticket;
import com.Movieticket.MovieTicket.model.User;
import com.Movieticket.MovieTicket.repo.ShowsRepo;
import com.Movieticket.MovieTicket.repo.TicketRepo;
import com.Movieticket.MovieTicket.repo.UserRepo;
import com.Movieticket.MovieTicket.util.TicketMapper;
import com.Movieticket.MovieTicket.util.TicketResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TicketService {
    private TicketRepo ticketRepo;

    private ShowsRepo showsRepo;

    private UserRepo userRepo;

    public TicketService(TicketRepo ticketRepo, ShowsRepo showsRepo, UserRepo userRepo) {
        this.ticketRepo = ticketRepo;
        this.showsRepo = showsRepo;
        this.userRepo = userRepo;
    }

    public TicketResponse addTicket(TicketDTO ticketDTO){
        Optional<Show> show  =  showsRepo.findById(ticketDTO.getShow_id());
        if (show.isEmpty()){
            throw new RuntimeException("Show doesn't exist");
        }
        Optional<User> user  =  userRepo.findByEmail(ticketDTO.getUserEmail());
        if (user.isEmpty()){
            throw new RuntimeException("User doesn't exist");
        }

        
        Boolean isSeatAvailable = checkAvailability(show.get().getShowSeatList(), ticketDTO.getBooking_ticket());

        if (!isSeatAvailable){
            throw new RuntimeException("Selected Seat is not available");
        }


        Double TotalPrice = getTotalPrice(show.get().getShowSeatList(),ticketDTO.getBooking_ticket());

        String bookedSeat = convertToString(ticketDTO.getBooking_ticket());

        Ticket ticket = new Ticket();
        ticket.setTotalTicketsPrice(TotalPrice);
        ticket.setBookedAt(show.get().getDate());
        ticket.setBookedSeats(bookedSeat);
        ticket.setShow(show.get());
        ticket.setUser(user.get());

        ticketRepo.save(ticket);

        user.get().getTicketList().add(ticket);
        show.get().getTicketList().add(ticket);
        userRepo.save(user.get());
        showsRepo.save(show.get());

        TicketResponse ticketResponse = TicketMapper.ticketResponseMaker(show.get(), ticket) ;
        return ticketResponse;

    }

    private String convertToString(List<String> bookingTicket) {
        StringBuilder bookedSeats = new StringBuilder();
        for (String a:bookingTicket ) {
            bookedSeats.append(a).append(",");
        }
        return bookingTicket.toString();
    }

    private Double getTotalPrice(List<ShowSeat> showSeatList, List<String> bookingTicket) {
        Double totalPrice = 0.0;
        for (ShowSeat showSeat : showSeatList){
            if (bookingTicket.contains(showSeat)) {
                totalPrice= totalPrice + showSeat.getSeatPrice();
                showSeat.setIs_available(false);
            }
        }
        return totalPrice;

    }

    private Boolean checkAvailability(List<ShowSeat> showSeatList, List<String> bookingTicket) {
        for (ShowSeat showSeat : showSeatList){
            if (bookingTicket.contains(showSeat) && !showSeat.getIs_available()){
                return false;
            }
        }
        return  true;
    }
}
