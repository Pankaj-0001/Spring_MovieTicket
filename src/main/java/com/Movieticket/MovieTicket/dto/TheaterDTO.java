package com.Movieticket.MovieTicket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TheaterDTO {
    private String theaterId;
    private long numberOfSeats;
}
