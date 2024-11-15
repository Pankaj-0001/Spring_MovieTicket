package com.Movieticket.MovieTicket.dto;

import com.Movieticket.MovieTicket.model.Cinema_hall;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TheaterDTO {
    private String theaterId;
    private long numberOfSeats;
    private String cinema_hall_id;
}
