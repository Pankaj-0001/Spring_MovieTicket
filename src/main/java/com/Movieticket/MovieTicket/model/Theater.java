package com.Movieticket.MovieTicket.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "theater")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Theater {
    @Id
    private String theaterId;
    private long numberOfSeats;


    @ManyToOne(fetch =FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "cinema_hall_id")
    private Cinema_hall cinema_hall;

    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    private List<TheaterSeat> theaterSeatList = new ArrayList<>();


}
