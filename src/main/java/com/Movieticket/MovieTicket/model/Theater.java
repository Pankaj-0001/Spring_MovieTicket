package com.Movieticket.MovieTicket.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    private List<Shows> shows;

    @ManyToOne
    private Cinema_hall cinema_hall;
}
