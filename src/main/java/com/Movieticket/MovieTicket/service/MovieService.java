package com.Movieticket.MovieTicket.service;

import com.Movieticket.MovieTicket.dto.MovieDTO;
import com.Movieticket.MovieTicket.model.Movie;
import com.Movieticket.MovieTicket.repo.MovieRepo;
import com.Movieticket.MovieTicket.util.MovieMapper;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class MovieService {

    private MovieRepo movieRepo;

    public MovieService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    public List<MovieDTO> getMovies() {
        List<Movie> movies = movieRepo.findAll();
        List<MovieDTO> movieDTO =new ArrayList<>();
        for(Movie movie : movies){
            movieDTO.add(MovieMapper.mapTomovieDTO(movie));
        }
        return movieDTO;
    }



}
