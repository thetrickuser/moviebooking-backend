package com.thetrickuser.moviebooking.bookingservice.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String seatId;
    String seatNum;
    Boolean isBooked;
    Double price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "show_id")
    @JsonBackReference(value = "show-reference")
    private CinemaShow show;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    @JsonBackReference(value = "booking-reference")
    private Booking booking;

}
