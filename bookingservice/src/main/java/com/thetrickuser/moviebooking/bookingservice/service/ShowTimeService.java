package com.thetrickuser.moviebooking.bookingservice.service;

import com.thetrickuser.moviebooking.bookingservice.entity.*;
import com.thetrickuser.moviebooking.bookingservice.model.AvailabilityStatus;
import com.thetrickuser.moviebooking.bookingservice.model.SearchShowsRequest;
import com.thetrickuser.moviebooking.bookingservice.model.SearchShowsResponse;
import com.thetrickuser.moviebooking.bookingservice.model.ShowDetails;
import com.thetrickuser.moviebooking.bookingservice.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ShowTimeService {

    @Autowired
    private ShowTimeRepository showTimeRepository;

    @Autowired
    private ScreenRepository screenRepository;

    @Autowired
    private ShowSeatsRepository showSeatsRepository;

    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    private MovieRepository movieRepository;

    public ShowTime addShow(ShowTime showTime) {
        Screen screen = screenRepository.findById(showTime.getScreen().getId()).get();
        showTime.setAvailableSeatCount(screen.getTotalSeats());
        ShowTime savedShow = showTimeRepository.save(showTime);
        generateShowSeats(savedShow, screen);
        return savedShow;
    }

    private void generateShowSeats(ShowTime savedShow, Screen screen) {
        Integer totalSeats = screen.getTotalSeats();
        Integer rows = screen.getNumberOfRows();
        Integer columns = screen.getNumberOfColumns();

        Character rowChar = 'A';
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=columns; j++) {
                String seatNum = rowChar + String.valueOf(j);
                ShowSeat seat = new ShowSeat();
                seat.setAvailability(AvailabilityStatus.AVAILABLE);
                seat.setShowTime(savedShow);
                seat.setSeatNumber(seatNum);
                showSeatsRepository.save(seat);
            }
            rowChar++;
        }

    }
}
