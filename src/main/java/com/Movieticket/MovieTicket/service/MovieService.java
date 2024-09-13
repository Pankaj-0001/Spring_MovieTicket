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

    public MovieDTO addMovie(MovieDTO movieDTO) {
        Movie movie = MovieMapper.mapTomovie(movieDTO);
        Movie savedMovie = movieRepo.save(movie);

        return MovieMapper.mapTomovieDTO(savedMovie);
    }


    public MovieDTO updateMovie(MovieDTO movieDTO) {
        if(movieRepo.existsById(movieDTO.getLicenseid())){
            Movie movie = MovieMapper.mapTomovie(movieDTO);
            Movie updatedMov = movieRepo.save(movie);
            return MovieMapper.mapTomovieDTO(updatedMov);
        }
        else {
            return null;
        }
    }
}
