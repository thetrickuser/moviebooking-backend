package com.thetrickuser.moviebooking.bookingservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchShowsResponse {
    private LocalDate showDate;
    private List<ShowDetails> shows;



}
