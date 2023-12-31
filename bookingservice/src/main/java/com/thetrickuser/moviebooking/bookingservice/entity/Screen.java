package com.thetrickuser.moviebooking.bookingservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Screen {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    private String name;
    private Integer numberOfRows;
    private Integer numberOfColumns;
    private Integer totalSeats;
}
