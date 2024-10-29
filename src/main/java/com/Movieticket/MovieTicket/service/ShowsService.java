package com.Movieticket.MovieTicket.service;

import com.Movieticket.MovieTicket.dto.ShowsDTO;
import com.Movieticket.MovieTicket.model.Shows;
import com.Movieticket.MovieTicket.repo.ShowsRepo;
import com.Movieticket.MovieTicket.util.ShowsMapper;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ShowsService {

    private final ShowsRepo showsRepo;
    @Autowired
    private ShowsMapper showsMapper;


    public ShowsService(ShowsRepo showsRepo) {
        this.showsRepo = showsRepo;
    }

    public ShowsDTO addShow(ShowsDTO showsDTO){
        Shows shows = showsMapper.mapToshows(showsDTO);
        Shows savedShow = showsRepo.save(shows);
        return showsMapper.mapToshowDTO(savedShow);
    }
}
