package com.Movieticket.MovieTicket.util;

import com.Movieticket.MovieTicket.dto.TheaterDTO;
import com.Movieticket.MovieTicket.model.Theater;

public class TheaterMapper {

    public static Theater mepTotheater(TheaterDTO theaterDTO){
        Theater theater= Theater.builder()
                .theaterId(theaterDTO.getTheaterId())
                .numberOfSeats(theaterDTO.getNumberOfSeats())
                .build();
        return theater;
    }
}
