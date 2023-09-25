package com.thetrickuser.moviebooking.bookingservice.repository;

import com.thetrickuser.moviebooking.bookingservice.entity.ShowSeat;
import com.thetrickuser.moviebooking.bookingservice.entity.ShowTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat,String> {
    List<ShowSeat> findByShowTime(ShowTime showTime);
}
