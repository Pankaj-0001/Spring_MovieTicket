package com.Movieticket.MovieTicket.repo;

import com.Movieticket.MovieTicket.model.Cinema_hall;
import com.Movieticket.MovieTicket.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepo extends JpaRepository<Cinema_hall,String> {
}