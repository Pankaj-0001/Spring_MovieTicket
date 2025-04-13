package com.Movieticket.MovieTicket.model;

import com.Movieticket.MovieTicket.enums.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name ="theater_seat")
@AllArgsConstructor
@NoArgsConstructor
public class TheaterSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String seat_number;

    @Enumerated(value = EnumType.STRING)
    private SeatType seat_type;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="theater_id")
    private Theater theater;

}
