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
    private String id;
    private Time start;
    private Time end;
    private String movie;
    private String theater;
}
