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
public class Screen {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String screenId;
    private String name;
    private Integer totalSeats;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cinema_id")
    @JsonBackReference
    private Cinema cinema;

}
