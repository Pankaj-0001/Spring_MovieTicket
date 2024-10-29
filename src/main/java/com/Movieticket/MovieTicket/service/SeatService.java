package com.Movieticket.MovieTicket.service;


import com.Movieticket.MovieTicket.dto.SeatDTO;
import com.Movieticket.MovieTicket.model.Seat;
import com.Movieticket.MovieTicket.repo.SeatRepo;
import com.Movieticket.MovieTicket.util.SeatMapper;

@org.springframework.stereotype.Service
public class SeatService {

    private SeatRepo seatRepo;

    private SeatMapper seatMapper;

    public SeatService(SeatRepo seatRepo, SeatMapper seatMapper) {
        this.seatRepo = seatRepo;
        this.seatMapper = seatMapper;
    }

    public SeatDTO addseat(SeatDTO seatDTO) {
        Seat seat = seatMapper.mapToseat(seatDTO);
        Seat saveSeat = seatRepo.save(seat);
        return seatMapper.mapToseatDto(saveSeat);
    }
}
