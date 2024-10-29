package com.Movieticket.MovieTicket.controller;

import com.Movieticket.MovieTicket.dto.SeatDTO;
import com.Movieticket.MovieTicket.service.SeatService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SeatController {
    private final SeatService seatService;

    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    @PostMapping("/addSeat")
    public ResponseEntity<SeatDTO> addShow(@RequestBody SeatDTO seatDTO){
        return new ResponseEntity<>(seatService.addseat(seatDTO), HttpStatus.CREATED);
    }

}
