package com.Movieticket.MovieTicket.service;

import com.Movieticket.MovieTicket.dto.TheaterDTO;
import com.Movieticket.MovieTicket.model.Theater;
import com.Movieticket.MovieTicket.repo.TheaterRepo;
import com.Movieticket.MovieTicket.util.TheaterMapper;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class TheaterService {

    private final TheaterRepo theaterRepo;
    @Autowired
    private TheaterMapper mapper;

    public TheaterService(TheaterRepo theaterRepo ) {
        this.theaterRepo = theaterRepo;
    }


    public TheaterDTO addTheater (TheaterDTO theaterDTO){
        Theater theater = mapper.mapTotheater(theaterDTO);
        Theater savedtheater= theaterRepo.save(theater);
        return mapper.mapTotheaterDTO(savedtheater);
    }
}
