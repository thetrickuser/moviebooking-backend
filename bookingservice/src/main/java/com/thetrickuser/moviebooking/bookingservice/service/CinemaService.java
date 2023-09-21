package com.thetrickuser.moviebooking.bookingservice.service;

import com.thetrickuser.moviebooking.bookingservice.entity.Cinema;
import com.thetrickuser.moviebooking.bookingservice.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;

    public Cinema addCinema(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }
}
