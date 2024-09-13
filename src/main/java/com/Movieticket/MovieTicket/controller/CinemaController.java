package com.Movieticket.MovieTicket.controller;

import com.Movieticket.MovieTicket.dto.Cinema_hallDTO;
import com.Movieticket.MovieTicket.repo.CinemaRepo;
import com.Movieticket.MovieTicket.service.CinemaHallService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CinemaController {

   private CinemaHallService cinemaHallService;

    public CinemaController(CinemaHallService cinemaHallService) {
        this.cinemaHallService = cinemaHallService;
    }

    @PostMapping("/addCinema")
    public ResponseEntity<Cinema_hallDTO> addCinema(@RequestBody Cinema_hallDTO cinemaHallDTO){
        return new ResponseEntity<>(cinemaHallService.addCinema(cinemaHallDTO), HttpStatus.CREATED);
    }
}
