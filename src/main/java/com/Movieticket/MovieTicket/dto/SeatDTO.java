package com.Movieticket.MovieTicket.dto;

import com.Movieticket.MovieTicket.enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatDTO {
    private String seatId;
    private String seatNo;
    private SeatType seatType;
    private Double seatPrice;
    private Boolean is_available;
    private String shows_id;
}
