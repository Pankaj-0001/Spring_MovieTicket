package com.Movieticket.MovieTicket.service;

import com.Movieticket.MovieTicket.dto.TheaterDTO;
import com.Movieticket.MovieTicket.dto.TheaterSeatRequest;
import com.Movieticket.MovieTicket.enums.SeatType;
import com.Movieticket.MovieTicket.model.Theater;
import com.Movieticket.MovieTicket.model.TheaterSeat;
import com.Movieticket.MovieTicket.repo.TheaterRepo;
import com.Movieticket.MovieTicket.util.TheaterMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class TheaterService {

    private final TheaterRepo theaterRepo;
    @Autowired
    private TheaterMapper mapper;

    public TheaterService(TheaterRepo theaterRepo ) {
        this.theaterRepo = theaterRepo;
    }



    public TheaterDTO addTheater (TheaterDTO theaterDTO){
        Theater theater = mapper.mapTotheater(theaterDTO);
        Theater savedtheater= theaterRepo.save(theater);
        return mapper.mapTotheaterDTO(savedtheater);
    }


    public String addTheaterSeat(TheaterSeatRequest request){
        Optional<Theater> theater = theaterRepo.findById(request.getTheater_id());

        if (theater.isEmpty()){
            throw new RuntimeException("Theater does not exist");
        }
        int noOfSeatInRow = request.getNoOfSeatInRow();
        int noOfPremiumSeat = request.getNoOfPremiumSeat();
        int noOfClassicSeat = request.getNoOfClassicSeat();

        Theater theater1 = theater.get();

        List<TheaterSeat> seatList = theater1.getTheaterSeatList();

        int counter = 1;
        int fill = 0;
        char ch = 'A';

        for (int i = 1; i <= noOfClassicSeat; i++) {
            String seatNo = Integer.toString(counter) + ch;

            ch++;
            fill++;
            if (fill == noOfSeatInRow) {
                fill = 0;
                counter++;
                ch = 'A';
            }

            TheaterSeat theaterSeat = new TheaterSeat();
            theaterSeat.setSeat_number(seatNo);
            theaterSeat.setSeat_type(SeatType.CLASSIC);
            theaterSeat.setTheater(theater1);
            seatList.add(theaterSeat);
        }

        for (int i = 1; i <= noOfPremiumSeat; i++) {
            String seatNo = Integer.toString(counter) + ch;

            ch++;
            fill++;
            if (fill == noOfSeatInRow) {
                fill = 0;
                counter++;
                ch = 'A';
            }

            TheaterSeat theaterSeat = new TheaterSeat();
            theaterSeat.setSeat_number(seatNo);
            theaterSeat.setSeat_type(SeatType.PREMIUM);
            theaterSeat.setTheater(theater1);
            seatList.add(theaterSeat);
        }
        theaterRepo.save(theater1);
        return "Request for the addition of theater seat have been processed and have been successful";
    }
}
