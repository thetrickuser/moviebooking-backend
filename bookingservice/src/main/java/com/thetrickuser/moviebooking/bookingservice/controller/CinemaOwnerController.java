package com.thetrickuser.moviebooking.bookingservice.controller;

import com.thetrickuser.moviebooking.bookingservice.entity.Cinema;
import com.thetrickuser.moviebooking.bookingservice.entity.Movie;
import com.thetrickuser.moviebooking.bookingservice.entity.Screen;
import com.thetrickuser.moviebooking.bookingservice.entity.ShowTime;
import com.thetrickuser.moviebooking.bookingservice.service.CinemaService;
import com.thetrickuser.moviebooking.bookingservice.service.MovieService;
import com.thetrickuser.moviebooking.bookingservice.service.ScreenService;
import com.thetrickuser.moviebooking.bookingservice.service.ShowTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CinemaOwnerController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private CinemaService cinemaService;

    @Autowired
    private ScreenService screenService;

    @Autowired
    private ShowTimeService showTimeService;

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

    @PostMapping("/addCinema")
    public Cinema addCinema(@RequestBody Cinema cinema) {
        return cinemaService.addCinema(cinema);
    }

    @PostMapping("/addScreen")
    public Screen addScreen(@RequestBody Screen screen) {
        return screenService.addScreen(screen);
    }

    @PostMapping("/addShow")
    public ShowTime addShow(@RequestBody ShowTime showTime) {
        return showTimeService.addShow(showTime);
    }

}
