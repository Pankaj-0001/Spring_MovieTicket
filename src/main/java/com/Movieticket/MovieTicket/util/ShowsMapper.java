package com.Movieticket.MovieTicket.util;

import com.Movieticket.MovieTicket.dto.ShowsDTO;
import com.Movieticket.MovieTicket.model.Shows;

public class ShowsMapper {

    public static Shows mapToshows(ShowsDTO showsDTO){
        Shows shows = Shows.builder()
                .id(showsDTO.getId())
                .start(showsDTO.getStart())
                .end(showsDTO.getEnd())
                .build();
        return shows;
    }
}
