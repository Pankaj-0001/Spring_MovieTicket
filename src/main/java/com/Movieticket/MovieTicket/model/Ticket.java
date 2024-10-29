package com.Movieticket.MovieTicket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ticket")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    private int ticketID;
    private String cinema_hall_name;
    private String movie_name;
    private int theater_id;
    private int show_id;
    private int seat_id;

}
