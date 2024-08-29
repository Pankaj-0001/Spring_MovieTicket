package com.Movieticket.MovieTicket.util;

import com.Movieticket.MovieTicket.dto.MovieDTO;
import com.Movieticket.MovieTicket.model.Movie;

public class MovieMapper {

    public static MovieDTO mapTomovieDTO(Movie movie){
        MovieDTO movieDTO = new MovieDTO(
                movie.getLicenseId(),
                movie.getMovieName(),
                movie.getDescription(),
                movie.getDuration(),
                movie.getLanguage(),
                movie.getReleaseDate(),
                movie.getCountry(),
                movie.getGenre()
        );
        return movieDTO;
    }



    public static Movie mapTomovie(MovieDTO movieDTO){
        Movie movie =Movie.builder()
                .licenseId(movieDTO.getLicenseid())
                .movieName(movieDTO.getMoviename())
                .description(movieDTO.getDescription())
                .duration(movieDTO.getDuration())
                .language(movieDTO.getLanguage())
                .releaseDate(movieDTO.getReleasedate())
                .country(movieDTO.getCountry())
                .genre(movieDTO.getGenre())
                .build();
        return movie;
    }
}
