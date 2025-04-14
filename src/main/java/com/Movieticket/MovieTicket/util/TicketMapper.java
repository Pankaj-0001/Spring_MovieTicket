package com.Movieticket.MovieTicket.util;

import com.Movieticket.MovieTicket.model.*;
import org.springframework.stereotype.Component;


@Component
public class TicketMapper {

    public static TicketResponse ticketResponseMaker(Show show , Ticket ticket){
        TicketResponse ticketResponse = TicketResponse.builder()
                .time(show.getStart())
                .date(show.getDate())
                .address(show.getTheater().getCinema_hall().getAddress())
                .cinema_hall_name(show.getTheater().getCinema_hall().getCineHallName())
                .movieName(show.getMovie().getMovieName())
                .theater_id(show.getTheater().getTheaterId())
                .totalPrice(ticket.getTotalTicketsPrice())
                .bookedSeats(ticket.getBookedSeats())
                .build();
        return ticketResponse;
    }
}
