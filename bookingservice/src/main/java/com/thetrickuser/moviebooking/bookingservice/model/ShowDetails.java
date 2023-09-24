package com.thetrickuser.moviebooking.bookingservice.model;

import com.thetrickuser.moviebooking.bookingservice.entity.ShowTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShowDetails {

    private String cinemaName;
    private List<ShowTime> showtimes;
}
