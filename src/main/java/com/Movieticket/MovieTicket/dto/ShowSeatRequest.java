package com.Movieticket.MovieTicket.dto;

import lombok.Data;

@Data
public class ShowSeatRequest {
    private String show_id;
    private Double priceOfPremiumSeat;
    private Double priceOfClassicSeat;
}
