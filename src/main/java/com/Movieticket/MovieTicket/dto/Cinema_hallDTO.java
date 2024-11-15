package com.Movieticket.MovieTicket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cinema_hallDTO {
    private String cineId;
    private String cineHallName;
    private String cineHallCity;
    private int theatersNumber;
}
