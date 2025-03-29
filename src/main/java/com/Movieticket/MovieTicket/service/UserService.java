package com.Movieticket.MovieTicket.service;

import com.Movieticket.MovieTicket.dto.UserRequest;
import com.Movieticket.MovieTicket.model.User;
import com.Movieticket.MovieTicket.repo.UserRepo;
import com.Movieticket.MovieTicket.util.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);


    public UserRequest register(UserRequest userRequest) {
        User user = UserMapper.userDtoTouser(userRequest);
        user.setPassword(encoder.encode(user.getPassword()));
        repo.save(user);
        return UserMapper.usertoDTO(user);
    }

    public String verify(UserRequest usersRequest) {
        return "Success";
    }
}
