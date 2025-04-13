package com.Movieticket.MovieTicket.repo;

import com.Movieticket.MovieTicket.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowsRepo extends JpaRepository<Show,String> {
}
