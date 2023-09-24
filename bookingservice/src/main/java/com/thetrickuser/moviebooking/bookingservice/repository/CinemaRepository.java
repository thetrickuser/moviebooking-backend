package com.thetrickuser.moviebooking.bookingservice.repository;

import com.thetrickuser.moviebooking.bookingservice.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema,String> {
    List<Cinema> findByLocalityAndCity(String locality, String city);
    List<Cinema> findByCity(String city);
}
