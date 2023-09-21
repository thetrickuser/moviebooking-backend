package com.thetrickuser.moviebooking.bookingservice.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.thetrickuser.moviebooking.bookingservice.model.BookingStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String bookingId;
    private Integer seatCount;
    private BookingStatus status;
    private LocalDateTime createdOn;

    @OneToOne
    @JoinColumn(name = "show_id")
    private CinemaShow show;

    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "booking-reference")
    List<Seat> bookedSeats;

}

