package com.Movieticket.MovieTicket.util;

import com.Movieticket.MovieTicket.dto.TicketDTO;
import com.Movieticket.MovieTicket.model.*;
import com.Movieticket.MovieTicket.repo.*;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TicketMapper {
//
//    private CinemaRepo cinemaRepo;
//    private MovieRepo movieRepo;
//    private TheaterRepo theaterRepo;
//    private ShowsRepo showsRepo;
//    private SeatRepo seatRepo;
//
//    public TicketMapper(CinemaRepo cinemaRepo, MovieRepo movieRepo, TheaterRepo theaterRepo, ShowsRepo showsRepo, SeatRepo seatRepo) {
//        this.cinemaRepo = cinemaRepo;
//        this.movieRepo = movieRepo;
//        this.theaterRepo = theaterRepo;
//        this.showsRepo = showsRepo;
//        this.seatRepo = seatRepo;
//    }
//
//    public Ticket maptoTicket(TicketDTO ticketDTO){
//        Optional<ShowSeat> seat = seatRepo.findById(ticketDTO.getSeat_id());
//        Optional<Show> show = showsRepo.findById(ticketDTO.getShow_id());
//        Optional<Theater> theater = theaterRepo.findById(show.get().getTheater().getTheaterId());
//        Optional<Cinema_hall> cinema_hall = cinemaRepo.findById(theater.get().getCinema_hall().getCineId());
//        Optional<Movie> movie = movieRepo.findById(show.get().getMovie().getLicenseId());
//        if (
//                seat.isPresent() && show.isPresent() && theater.isPresent() && cinema_hall.isPresent() && movie.isPresent()
//        ){
//            Ticket ticket = new Ticket(
//
//            );
//            return ticket;
//        }else {
//            throw new RuntimeException("Not Found");
//        }
//    }
//
//
//    public TicketDTO maptoTicketDTO (Ticket ticket){
//        TicketDTO ticketDTO = new TicketDTO(
//
//        );
//        return ticketDTO;
//    }
}
