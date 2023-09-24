package com.thetrickuser.moviebooking.bookingservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchShowsRequest {

    private String locality;
    private String city;
    private LocalDate searchDate;
    private String movieName;

}
