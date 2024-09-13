package com.Movieticket.MovieTicket.service;

import com.Movieticket.MovieTicket.dto.TheaterDTO;
import com.Movieticket.MovieTicket.model.Theater;
import com.Movieticket.MovieTicket.repo.TheaterRepo;
import com.Movieticket.MovieTicket.util.TheaterMapper;

@org.springframework.stereotype.Service
public class TheaterService {

    private final TheaterRepo theaterRepo;

    public TheaterService(TheaterRepo theaterRepo ) {
        this.theaterRepo = theaterRepo;
    }


    public TheaterDTO addTheater (TheaterDTO theaterDTO){

        Theater theater = TheaterMapper.mapTotheater(theaterDTO);
        Theater savedtheater= theaterRepo.save(theater);
        return TheaterMapper.mapTotheaterDTO(savedtheater);
    }
}
