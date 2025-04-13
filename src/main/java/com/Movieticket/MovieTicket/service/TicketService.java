package com.Movieticket.MovieTicket.service;

import com.Movieticket.MovieTicket.dto.TicketDTO;
import com.Movieticket.MovieTicket.model.Ticket;
import com.Movieticket.MovieTicket.repo.TicketRepo;
import com.Movieticket.MovieTicket.util.TicketMapper;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    private TicketRepo ticketRepo;
    private TicketMapper ticketMapper;

    public TicketService(TicketRepo ticketRepo, TicketMapper ticketMapper) {
        this.ticketRepo = ticketRepo;
        this.ticketMapper = ticketMapper;
    }

//    public TicketDTO addTicket(TicketDTO ticketDTO){
//        Ticket ticket = ticketMapper.maptoTicket(ticketDTO);
//        Ticket saveTicket = ticketRepo.save(ticket);
//        return ticketMapper.maptoTicketDTO(saveTicket);
//    }
}
