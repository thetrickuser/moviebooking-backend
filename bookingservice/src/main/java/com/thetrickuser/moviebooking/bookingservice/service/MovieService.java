package com.thetrickuser.moviebooking.bookingservice.service;

import com.thetrickuser.moviebooking.bookingservice.entity.Movie;
import com.thetrickuser.moviebooking.bookingservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
