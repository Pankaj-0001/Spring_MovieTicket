package com.Movieticket.MovieTicket.util;

import com.Movieticket.MovieTicket.dto.SeatDTO;
import com.Movieticket.MovieTicket.model.Seat;
import com.Movieticket.MovieTicket.model.Shows;
import com.Movieticket.MovieTicket.repo.ShowsRepo;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SeatMapper {

    private ShowsRepo showsRepo;

    public SeatMapper(ShowsRepo showsRepo) {
        this.showsRepo = showsRepo;
    }

    public  Seat mapToseat(SeatDTO seatDTO){
        Optional<Shows> shows = showsRepo.findById(seatDTO.getShows_id());
        if (shows.isPresent()){
            Seat seat=Seat.builder()
                    .seatId(seatDTO.getSeatId())
                    .seatPrice((seatDTO.getSeatPrice()))
                    .seatStatus(seatDTO.getSeatStatus())
                    .shows(shows.get())
                    .build();
            return seat;
        }
        else {
            throw  new RuntimeException("Not Found");
        }
    }

    public SeatDTO mapToseatDto (Seat seat){
        SeatDTO seatDTO = new SeatDTO(
                seat.getSeatId(),
                seat.getSeatPrice(),
                seat.getSeatStatus(),
                seat.getShows().getId()
        );
        return seatDTO;
    }
}
