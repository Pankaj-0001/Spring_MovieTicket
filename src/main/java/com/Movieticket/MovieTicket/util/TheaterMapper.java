package com.Movieticket.MovieTicket.util;

import com.Movieticket.MovieTicket.dto.TheaterDTO;
import com.Movieticket.MovieTicket.model.Theater;

public class TheaterMapper {



    public static Theater mapTotheater(TheaterDTO theaterDTO){

        Theater theater= Theater.builder()
                .theaterId(theaterDTO.getTheaterId())
                .numberOfSeats(theaterDTO.getNumberOfSeats())
                .cinema_hall(theaterDTO.getCinema_hall())
                .build();
        return theater;
    }

    public static TheaterDTO mapTotheaterDTO(Theater theater){
        TheaterDTO theaterDTO = new TheaterDTO(
                theater.getTheaterId(),
                theater.getNumberOfSeats(),
                theater.getCinema_hall()
        );

        return theaterDTO;
    }
}
