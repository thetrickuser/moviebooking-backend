package com.thetrickuser.moviebooking.bookingservice.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CinemaShow {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String showId;
    LocalDateTime startTime;
    LocalDateTime endTime;
    LocalDateTime createdOn;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @OneToOne
    @JoinColumn(name = "screen_id")
    private Screen screen;

    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "show-reference")
    private List<Seat> seats = new ArrayList<>();
}
