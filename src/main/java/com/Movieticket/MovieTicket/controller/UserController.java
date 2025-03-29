package com.Movieticket.MovieTicket.controller;

import com.Movieticket.MovieTicket.dto.UserRequest;
import com.Movieticket.MovieTicket.model.User;
import com.Movieticket.MovieTicket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/signup")
    public UserRequest register(@RequestBody UserRequest userRequest){
        return service.register(userRequest);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserRequest userRequest){
        return service.verify(userRequest);
    }
}
