package com.thetrickuser.moviebooking.bookingservice.entity;

import com.thetrickuser.moviebooking.bookingservice.model.AvailabilityStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShowSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "showtime_id")
    private ShowTime showTime;

    private String seatNumber;
    private AvailabilityStatus availability;
}
