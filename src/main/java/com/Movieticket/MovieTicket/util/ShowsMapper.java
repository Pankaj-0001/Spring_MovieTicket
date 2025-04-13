package com.Movieticket.MovieTicket.util;

import com.Movieticket.MovieTicket.dto.ShowsDTO;
import com.Movieticket.MovieTicket.model.Movie;
import com.Movieticket.MovieTicket.model.Show;
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



    public Show mapToshows(ShowsDTO showsDTO){
        Optional<Movie> movie = movieRepo.findById(showsDTO.getMovie());
        Optional<Theater> theater = theaterRepo.findById(showsDTO.getTheater());
        if (movie.isPresent() && theater.isPresent()) {
            Show show = new Show();
            show.setId(showsDTO.getId());
            show.setStart(showsDTO.getStart());
            show.setEnd(showsDTO.getEnd());
            show.setMovie(movie.get());
            show.setTheater(theater.get());
            return show;
        }else {
            throw new RuntimeException("nothing found");
        }
    }
    public  ShowsDTO mapToshowDTO(Show show){
        ShowsDTO showsDTO = new ShowsDTO(
                show.getId(),
                show.getStart(),
                show.getEnd(),
                show.getMovie().getLicenseId(),
                show.getTheater().getTheaterId()
        );
        return showsDTO;
    }
}
