package com.Movieticket.MovieTicket.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "movie")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    @Id
    private int licenseId;
    private String movieName;
    private String description;
    private Time duration;
    private String language;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "DD-MM-YYYY")
    private Date releaseDate;
    private String  country;
    private String genre;



}
