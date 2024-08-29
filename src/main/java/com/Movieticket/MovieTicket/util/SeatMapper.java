package com.Movieticket.MovieTicket.util;

import com.Movieticket.MovieTicket.dto.SeatDTO;
import com.Movieticket.MovieTicket.model.Seat;

public class SeatMapper {

    public static Seat mapToseat(SeatDTO seatDTO){
        Seat seat=Seat.builder()
                .seatId(seatDTO.getSeatId())
                .seatPrice((seatDTO.getSeatPrice()))
                .seatStatus(seatDTO.getSeatStatus())
                .build();
        return seat;
    }
}
