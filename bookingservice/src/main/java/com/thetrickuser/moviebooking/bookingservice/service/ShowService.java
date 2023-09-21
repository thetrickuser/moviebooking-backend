package com.thetrickuser.moviebooking.bookingservice.service;

import com.thetrickuser.moviebooking.bookingservice.entity.CinemaShow;
import com.thetrickuser.moviebooking.bookingservice.repository.CinemaShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ShowService {

    @Autowired
    private CinemaShowRepository showRepository;

    public List<CinemaShow> addShows(List<CinemaShow> shows) {
        List<CinemaShow> savedShows = new ArrayList<>();
        for (CinemaShow show: shows) {
            show.setCreatedOn(LocalDateTime.now());
            savedShows.add(showRepository.save(show));
        }

        return savedShows;
    }
}
