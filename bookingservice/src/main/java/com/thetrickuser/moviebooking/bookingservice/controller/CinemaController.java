package com.thetrickuser.moviebooking.bookingservice.controller;

import com.thetrickuser.moviebooking.bookingservice.entity.Cinema;
import com.thetrickuser.moviebooking.bookingservice.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/cinema")
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;

    @PostMapping("/addCinema")
    public Cinema addCinema(@RequestBody Cinema cinema) {
        return cinemaService.addCinema(cinema);
    }
}
