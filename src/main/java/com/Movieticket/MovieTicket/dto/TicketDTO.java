package com.Movieticket.MovieTicket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {
    private List<String> booking_ticket;
    private String user_id;
    private String show_id;
}
