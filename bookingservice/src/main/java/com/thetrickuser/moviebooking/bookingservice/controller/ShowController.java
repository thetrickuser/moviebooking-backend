package com.thetrickuser.moviebooking.bookingservice.controller;

import com.thetrickuser.moviebooking.bookingservice.entity.CinemaShow;
import com.thetrickuser.moviebooking.bookingservice.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShowController {

    @Autowired
    private ShowService showService;

    @PostMapping("/addShows")
    public List<CinemaShow> addShows(@RequestBody List<CinemaShow> shows) {
        return showService.addShows(shows);
    }
}
