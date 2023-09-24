package com.thetrickuser.moviebooking.bookingservice.repository;

import com.thetrickuser.moviebooking.bookingservice.entity.ShowTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowTimeRepository extends JpaRepository<ShowTime,String> {
    List<ShowTime> findByMovieIdAndCinemaId(String movieId, String cinemaId);
}
