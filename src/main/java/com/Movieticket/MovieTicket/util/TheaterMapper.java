package com.Movieticket.MovieTicket.util;

import com.Movieticket.MovieTicket.dto.TheaterDTO;
import com.Movieticket.MovieTicket.model.Cinema_hall;
import com.Movieticket.MovieTicket.model.Theater;
import com.Movieticket.MovieTicket.repo.CinemaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TheaterMapper {

    @Autowired
    private CinemaRepo cinemaRepo;


    public  Theater mapTotheater(TheaterDTO theaterDTO){
        Optional<Cinema_hall> cinema_hall = cinemaRepo.findById(theaterDTO.getCinema_hall_id());
        if(cinema_hall.isPresent()){
            Theater theater= new Theater(
                    theaterDTO.getTheaterId(),
                    theaterDTO.getNumberOfSeats(),
                    cinema_hall.get()
            );
            return theater;
        }else{
            throw new RuntimeException("no cinema found");
        }
    }

    public  TheaterDTO mapTotheaterDTO(Theater theater){
        TheaterDTO theaterDTO = new TheaterDTO(
                theater.getTheaterId(),
                theater.getNumberOfSeats(),
                theater.getCinema_hall().getCineId()
        );

        return theaterDTO;
    }
}
