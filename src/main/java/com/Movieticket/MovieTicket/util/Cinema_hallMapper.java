package com.Movieticket.MovieTicket.util;

import com.Movieticket.MovieTicket.dto.Cinema_hallDTO;
import com.Movieticket.MovieTicket.model.Cinema_hall;
import org.springframework.stereotype.Component;

@Component
public class Cinema_hallMapper {



    public  static Cinema_hallDTO mapTocineHallDTO(Cinema_hall cinemaHall){
        Cinema_hallDTO cinemaHallDTO = new Cinema_hallDTO(
                cinemaHall.getCineId(),
                cinemaHall.getCineHallName(),
                cinemaHall.getCineHallCity(),
                cinemaHall.getTheatersNumber()
        );
        return cinemaHallDTO;
    }
    public static Cinema_hall mapTocineHall(Cinema_hallDTO cinemaHallDTO){
         Cinema_hall cinemaHall = Cinema_hall.builder()
                 .cineId(cinemaHallDTO.getCineId())
                 .cineHallName(cinemaHallDTO.getCineHallName())
                 .cineHallCity(cinemaHallDTO.getCineHallCity())
                 .theatersNumber(cinemaHallDTO.getTheatersNumber())
                 .build();
         return cinemaHall;
    }

}
