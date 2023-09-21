package com.thetrickuser.moviebooking.bookingservice.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String cinemaId;
    private String city;
    private String state;
    private String locality;
    private String name;
    private Integer totalScreens;

    @OneToMany(mappedBy = "cinema", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Screen> screens = new ArrayList<>();

}
