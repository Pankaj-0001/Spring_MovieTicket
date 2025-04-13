package com.Movieticket.MovieTicket.controller;

import com.Movieticket.MovieTicket.dto.TheaterDTO;
import com.Movieticket.MovieTicket.dto.TheaterSeatRequest;
import com.Movieticket.MovieTicket.service.TheaterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TheaterController {

    private TheaterService theaterService;

    public TheaterController(TheaterService theaterService) {
        this.theaterService = theaterService;
    }

    @PostMapping("/addTheater")
    public ResponseEntity<TheaterDTO> addTheater(@RequestBody TheaterDTO theaterDTO){
        return new ResponseEntity<>(theaterService.addTheater(theaterDTO), HttpStatus.CREATED);
    }

    @PostMapping("/addTheaterSeat")
    public ResponseEntity<String> addTheaterSeat(@RequestBody TheaterSeatRequest request) {
        String result = theaterService.addTheaterSeat(request);
        return new ResponseEntity<>(result, HttpStatus.CREATED);

    }
}
