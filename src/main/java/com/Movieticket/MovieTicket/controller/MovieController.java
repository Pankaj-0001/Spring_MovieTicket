package com.Movieticket.MovieTicket.controller;

import com.Movieticket.MovieTicket.dto.MovieDTO;
import com.Movieticket.MovieTicket.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<MovieDTO>> getmovies(){
        return new ResponseEntity<>(movieService.getMovies(), HttpStatus.OK);
    }



}
