package com.thetrickuser.moviebooking.bookingservice.service;

import com.thetrickuser.moviebooking.bookingservice.entity.ShowSeat;
import com.thetrickuser.moviebooking.bookingservice.entity.ShowTime;
import com.thetrickuser.moviebooking.bookingservice.model.GetSeatsResponse;
import com.thetrickuser.moviebooking.bookingservice.model.SeatDetails;
import com.thetrickuser.moviebooking.bookingservice.repository.ShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowSeatService {

    @Autowired
    private ShowSeatRepository showSeatRepository;

    public GetSeatsResponse getSeats(String showTimeId) {
        ShowTime show = new ShowTime();
        show.setId(showTimeId);
        List<ShowSeat> seats = showSeatRepository.findByShowTime(show);

        GetSeatsResponse response = new GetSeatsResponse();
        response.setSeatDetailsList(new ArrayList<>());
        for (ShowSeat seat: seats) {
            SeatDetails seatDetails = new SeatDetails();
            seatDetails.setSeatNumber(seat.getSeatNumber());
            seatDetails.setSeatId(seat.getId());
            seatDetails.setAvailabilityStatus(seat.getAvailability());
            response.getSeatDetailsList().add(seatDetails);
        }

        return response;
    }
}
