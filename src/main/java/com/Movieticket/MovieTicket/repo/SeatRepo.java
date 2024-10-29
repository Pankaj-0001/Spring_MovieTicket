package com.Movieticket.MovieTicket.repo;

import com.Movieticket.MovieTicket.model.Movie;
import com.Movieticket.MovieTicket.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepo extends JpaRepository<Seat,Integer> {
}
