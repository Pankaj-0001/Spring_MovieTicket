package com.Movieticket.MovieTicket.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cinema")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cinema_hall {
    @Id
    private String cineId;
    private String cineHallName;
    private String address;
    private int theatersNumber;

//    @OneToMany(mappedBy = "cinema_hall",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    private List<Theater> theaters;
}
