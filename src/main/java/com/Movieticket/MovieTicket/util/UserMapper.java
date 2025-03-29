package com.Movieticket.MovieTicket.util;

import com.Movieticket.MovieTicket.dto.UserRequest;
import com.Movieticket.MovieTicket.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static User userDtoTouser(UserRequest userRequest){
        User user = User.builder()
                .userid(userRequest.getUserid())
                .username(userRequest.getUsername())
                .password(userRequest.getPassword())
                .email_id(userRequest.getEmail_id())
                .city(userRequest.getCity())
                .roles(userRequest.getRoles())
                .build();
        return user;
    }

    public static UserRequest usertoDTO(User user){
        UserRequest userRequest = new UserRequest(
                user.getUserid(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail_id(),
                user.getRoles(),
                user.getCity()
        );
        return userRequest;
    }
}
