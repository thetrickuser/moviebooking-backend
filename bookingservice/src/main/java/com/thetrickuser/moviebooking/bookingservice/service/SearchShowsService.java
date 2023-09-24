package com.thetrickuser.moviebooking.bookingservice.service;

import com.thetrickuser.moviebooking.bookingservice.entity.Cinema;
import com.thetrickuser.moviebooking.bookingservice.entity.Movie;
import com.thetrickuser.moviebooking.bookingservice.entity.ShowTime;
import com.thetrickuser.moviebooking.bookingservice.model.SearchShowsRequest;
import com.thetrickuser.moviebooking.bookingservice.model.SearchShowsResponse;
import com.thetrickuser.moviebooking.bookingservice.model.ShowDetails;
import com.thetrickuser.moviebooking.bookingservice.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchShowsService {

    @Autowired
    private ShowTimeRepository showTimeRepository;

    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    private MovieRepository movieRepository;

    public SearchShowsResponse searchShows(SearchShowsRequest request) {
        SearchShowsResponse response = new SearchShowsResponse();
        List<ShowDetails> showDetailsList = new ArrayList<>();
        List<Cinema> cinemas = null;
        if (request.getLocality() != null) {
            cinemas = cinemaRepository.findByLocalityAndCity(request.getLocality(), request.getCity());
        } else {
            cinemas = cinemaRepository.findByCity(request.getCity());
        }
        Movie movie = movieRepository.findByName(request.getMovieName()).get();

        for (Cinema cinema: cinemas) {
            ShowDetails showDetails = new ShowDetails();
            List<ShowTime> shows = showTimeRepository.findByMovieIdAndCinemaId(movie.getId(), cinema.getId());
            shows = shows.stream()
                    .filter(show -> show.getShowtime().toLocalDate().isEqual(request.getSearchDate()))
                    .collect(Collectors.toList());
            showDetails.setShowtimes(shows);
            showDetails.setCinemaName(cinema.getName());
            showDetailsList.add(showDetails);
        }

        response.setShowDate(request.getSearchDate());
        response.setShows(showDetailsList);
        return response;
    }
}
