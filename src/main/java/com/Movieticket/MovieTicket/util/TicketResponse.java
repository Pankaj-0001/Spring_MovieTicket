package com.Movieticket.MovieTicket.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketResponse {
    private Time time;
    private Date date;
    private String movieName;
    private String cinema_hall_name;
    private String address;
    private String theater_id;

    private String bookedSeats;
    private Double totalPrice;
}
