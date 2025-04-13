package com.Movieticket.MovieTicket.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private int userid;
    private String username;
    private String password;
    private String email;
    private String roles;
    private String city;
    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Ticket> ticketList = new ArrayList<>();

}
