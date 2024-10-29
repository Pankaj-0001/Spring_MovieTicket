package com.Movieticket.MovieTicket.util;

import com.Movieticket.MovieTicket.dto.ShowsDTO;
import com.Movieticket.MovieTicket.model.Movie;
import com.Movieticket.MovieTicket.model.Shows;
import com.Movieticket.MovieTicket.model.Theater;
import com.Movieticket.MovieTicket.repo.MovieRepo;
import com.Movieticket.MovieTicket.repo.TheaterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ShowsMapper {
    @Autowired
    private  MovieRepo movieRepo;
    @Autowired
    private  TheaterRepo theaterRepo;



    public  Shows mapToshows(ShowsDTO showsDTO){
        Optional<Movie> movie = movieRepo.findById(showsDTO.getMovie());
        Optional<Theater> theater = theaterRepo.findById(showsDTO.getTheater());
        if (movie.isPresent() && theater.isPresent()) {
            Shows shows = new Shows();
            shows.setId(showsDTO.getId());
            shows.setStart(showsDTO.getStart());
            shows.setEnd(showsDTO.getEnd());
            shows.setMovie(movie.get());
            shows.setTheater(theater.get());
            return shows;
        }else {
            throw new RuntimeException("nothing found");
        }
    }
    public  ShowsDTO mapToshowDTO(Shows shows){
        ShowsDTO showsDTO = new ShowsDTO(
                shows.getId(),
                shows.getStart(),
                shows.getEnd(),
                shows.getMovie().getLicenseId(),
                shows.getTheater().getTheaterId()
        );
        return showsDTO;
    }
}
