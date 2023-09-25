package com.thetrickuser.moviebooking.bookingservice.controller;

import com.thetrickuser.moviebooking.bookingservice.entity.ShowSeat;
import com.thetrickuser.moviebooking.bookingservice.entity.ShowTime;
import com.thetrickuser.moviebooking.bookingservice.model.GetSeatsResponse;
import com.thetrickuser.moviebooking.bookingservice.model.SearchShowsRequest;
import com.thetrickuser.moviebooking.bookingservice.model.SearchShowsResponse;
import com.thetrickuser.moviebooking.bookingservice.service.SearchShowsService;
import com.thetrickuser.moviebooking.bookingservice.service.ShowSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private SearchShowsService searchShowsService;

    @Autowired
    private ShowSeatService showSeatService;

    @PostMapping("/searchShows")
    public SearchShowsResponse searchShows(@RequestBody SearchShowsRequest request) {
        return searchShowsService.searchShows(request);
    }

    @PostMapping("/getSeats")
    public GetSeatsResponse getSeats(@RequestBody String showTimeId) {
        return showSeatService.getSeats(showTimeId);
    }
}
