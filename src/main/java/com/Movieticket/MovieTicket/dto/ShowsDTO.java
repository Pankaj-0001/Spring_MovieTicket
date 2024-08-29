package com.Movieticket.MovieTicket.dto;

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
}
