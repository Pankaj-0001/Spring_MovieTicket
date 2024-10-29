package com.Movieticket.MovieTicket.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO {
    @Id
    private int licenseid;
    private String moviename;
    private String description;
    private Time duration;
    private String language;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "DD-mm-YYYY")
    private Date releasedate;
    private String  country;
    private String genre;
}
