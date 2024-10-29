package com.Movieticket.MovieTicket.controller;

import com.Movieticket.MovieTicket.dto.ShowsDTO;
import com.Movieticket.MovieTicket.service.ShowsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ShowsController {

    private final ShowsService showsService;

    public ShowsController(ShowsService showsService) {
        this.showsService = showsService;
    }

    @PostMapping("/addShow")
    public ResponseEntity<ShowsDTO> addShow(@RequestBody ShowsDTO showsDTO){
        return new ResponseEntity<>(showsService.addShow(showsDTO), HttpStatus.CREATED);
    }
}
