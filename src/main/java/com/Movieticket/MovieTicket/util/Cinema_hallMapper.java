package com.Movieticket.MovieTicket.util;

import com.Movieticket.MovieTicket.dto.Cinema_hallDTO;
import com.Movieticket.MovieTicket.model.Cinema_hall;

public class Cinema_hallMapper {

    public static Cinema_hall mapTOcine_hall(Cinema_hallDTO cinemaHallDTO){
         Cinema_hall cinemaHall = Cinema_hall.builder()
                 .cineId(cinemaHallDTO.getCineId())
                 .cineHallName(cinemaHallDTO.getCineHallName())
                 .cineHallCity(cinemaHallDTO.getCineHallCity())
                 .theatersNumber(cinemaHallDTO.getTheatersNumber())
                 .build();
         return cinemaHall;
    }

}
