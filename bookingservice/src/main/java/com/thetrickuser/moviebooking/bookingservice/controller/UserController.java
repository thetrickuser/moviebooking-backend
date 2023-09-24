package com.thetrickuser.moviebooking.bookingservice.controller;

import com.thetrickuser.moviebooking.bookingservice.model.SearchShowsRequest;
import com.thetrickuser.moviebooking.bookingservice.model.SearchShowsResponse;
import com.thetrickuser.moviebooking.bookingservice.service.SearchShowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private SearchShowsService searchShowsService;

    @PostMapping("/searchShows")
    public SearchShowsResponse searchShows(@RequestBody SearchShowsRequest request) {
        return searchShowsService.searchShows(request);
    }
}
