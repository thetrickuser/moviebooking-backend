package com.thetrickuser.moviebooking.bookingservice.repository;

import com.thetrickuser.moviebooking.bookingservice.entity.ShowTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowTimeRepository extends JpaRepository<ShowTime,String> {
}
