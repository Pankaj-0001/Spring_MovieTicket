package com.Movieticket.MovieTicket.service;

import com.Movieticket.MovieTicket.dto.Cinema_hallDTO;
import com.Movieticket.MovieTicket.dto.MovieDTO;
import com.Movieticket.MovieTicket.model.Cinema_hall;
import com.Movieticket.MovieTicket.model.Movie;
import com.Movieticket.MovieTicket.repo.CinemaRepo;
import com.Movieticket.MovieTicket.repo.MovieRepo;
import com.Movieticket.MovieTicket.util.Cinema_hallMapper;
import com.Movieticket.MovieTicket.util.MovieMapper;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class CinemaHallService {

    private CinemaRepo cinemaRepo;

    public CinemaHallService(CinemaRepo cinemaRepo) {
        this.cinemaRepo = cinemaRepo;
    }

    public Cinema_hallDTO addCinema(Cinema_hallDTO cinemaHallDTO) {
        Cinema_hall cinemaHall = Cinema_hallMapper.mapTocineHall(cinemaHallDTO);
        Cinema_hall savedcinema = cinemaRepo.save(cinemaHall);
        return Cinema_hallMapper.mapTocineHallDTO(savedcinema);
    }
}
