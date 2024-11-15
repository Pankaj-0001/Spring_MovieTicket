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
    private String ticketID;
    private String cinema_hall_name;
    private String movie_name;
    private String theater_id;
    private String show_id;
    private String seat_id;

}
