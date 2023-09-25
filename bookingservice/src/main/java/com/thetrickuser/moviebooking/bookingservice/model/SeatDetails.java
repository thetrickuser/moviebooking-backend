package com.thetrickuser.moviebooking.bookingservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatDetails {

    private String seatNumber;
    private AvailabilityStatus availabilityStatus;
    private String seatId;
}
