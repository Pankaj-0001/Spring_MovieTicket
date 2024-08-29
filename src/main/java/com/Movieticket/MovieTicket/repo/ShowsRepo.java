package com.Movieticket.MovieTicket.repo;

import com.Movieticket.MovieTicket.model.Movie;
import com.Movieticket.MovieTicket.model.Shows;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowsRepo extends JpaRepository<Shows,String> {
}
