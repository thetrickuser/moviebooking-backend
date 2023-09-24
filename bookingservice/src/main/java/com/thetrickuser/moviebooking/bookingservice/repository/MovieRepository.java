package com.thetrickuser.moviebooking.bookingservice.repository;

import com.thetrickuser.moviebooking.bookingservice.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {
    Optional<Movie> findByName(String name);
    List<Movie> findByGenre(String genre);
}
