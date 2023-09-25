package com.thetrickuser.moviebooking.bookingservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetSeatsResponse {

    private List<SeatDetails> seatDetailsList;
}
