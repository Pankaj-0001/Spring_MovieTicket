package com.Movieticket.MovieTicket.controller;

import com.Movieticket.MovieTicket.dto.MovieDTO;
import com.Movieticket.MovieTicket.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addMovie")
    public ResponseEntity<MovieDTO> addMovie(@RequestBody MovieDTO movieDTO){
        return new ResponseEntity<>(movieService.addMovie(movieDTO),HttpStatus.CREATED);
    }

    @PutMapping("/editMovie")
    public ResponseEntity<MovieDTO> updateMovie(@RequestBody MovieDTO movieDTO){
        MovieDTO movieDTO1= movieService.updateMovie(movieDTO);
        if(movieDTO1!=null){
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



}
