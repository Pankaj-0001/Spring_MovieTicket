package com.Movieticket.MovieTicket.controller;

import com.Movieticket.MovieTicket.dto.ShowsDTO;
import com.Movieticket.MovieTicket.dto.TicketDTO;
import com.Movieticket.MovieTicket.model.Ticket;
import com.Movieticket.MovieTicket.service.ShowsService;
import com.Movieticket.MovieTicket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TicketController {

    @Autowired
    private TicketService ticketService;


    @PostMapping("/addTicket")
    public ResponseEntity<TicketDTO> addTicket(@RequestBody TicketDTO ticketDTO){
        return new ResponseEntity<>(ticketService.addTicket(ticketDTO), HttpStatus.CREATED);
    }
}
