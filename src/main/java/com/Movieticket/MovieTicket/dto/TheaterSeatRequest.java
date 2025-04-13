package com.Movieticket.MovieTicket.dto;

import lombok.Data;

@Data
public class TheaterSeatRequest {
    private String theater_id;
    private int noOfSeatInRow;
    private int noOfPremiumSeat;
    private int noOfClassicSeat;
}
