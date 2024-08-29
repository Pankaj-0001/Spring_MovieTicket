package com.Movieticket.MovieTicket.repo;

import com.Movieticket.MovieTicket.model.Movie;
import com.Movieticket.MovieTicket.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepo extends JpaRepository<Theater,String> {
}
