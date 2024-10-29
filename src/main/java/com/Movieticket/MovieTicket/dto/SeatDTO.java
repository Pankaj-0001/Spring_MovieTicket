package com.Movieticket.MovieTicket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatDTO {
    private int seatId;
    private Double seatPrice;
    private Boolean seatStatus;
    private int shows_id;
}
