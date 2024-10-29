package com.Movieticket.MovieTicket.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "cinema")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cinema_hall {
    @Id
    private int cineId;
    private String cineHallName;
    private String cineHallCity;
    private int theatersNumber;

//    @OneToMany(mappedBy = "cinema_hall",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    private List<Theater> theaters;
}
