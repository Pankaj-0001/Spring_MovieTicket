package com.Movieticket.MovieTicket.dto;

import com.Movieticket.MovieTicket.model.Movie;
import com.Movieticket.MovieTicket.model.Theater;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShowsDTO {
    private int id;
    private Time start;
    private Time end;
    private int movie;
    private int theater;
}
