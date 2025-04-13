package com.Movieticket.MovieTicket.util;

import com.Movieticket.MovieTicket.dto.SeatDTO;
import com.Movieticket.MovieTicket.model.ShowSeat;
import com.Movieticket.MovieTicket.model.Show;
import com.Movieticket.MovieTicket.repo.ShowsRepo;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SeatMapper {

//    private ShowsRepo showsRepo;
//
//    public SeatMapper(ShowsRepo showsRepo) {
//        this.showsRepo = showsRepo;
//    }
//
//    public ShowSeat mapToseat(SeatDTO seatDTO){
//        Optional<Show> shows = showsRepo.findById(seatDTO.getShows_id());
//        if (shows.isPresent()){
//            ShowSeat showSeat = ShowSeat.builder()
//                    .seatId(seatDTO.getSeatId())
//                    .seatNo(seatDTO.getSeatNo())
//                    .seatType(seatDTO.getSeatType())
//                    .seatPrice(seatDTO.getSeatPrice())
//                    .is_available(seatDTO.getIs_available())
//                    .show(shows.get())
//                    .build();
//            return showSeat;
//        }
//        else {
//            throw  new RuntimeException("Not Found");
//        }
//    }
//
//    public SeatDTO mapToseatDto (ShowSeat showSeat){
//        SeatDTO seatDTO = new SeatDTO(
//                showSeat.getSeatId(),
//                showSeat.getSeatNo(),
//                showSeat.getSeatType(),
//                showSeat.getSeatPrice(),
//                showSeat.getIs_available(),
//                showSeat.getShow().getId()
//        );
//        return seatDTO;
//    }
}
