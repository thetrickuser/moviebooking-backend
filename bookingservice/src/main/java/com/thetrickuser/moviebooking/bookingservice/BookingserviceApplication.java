package com.thetrickuser.moviebooking.bookingservice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.thetrickuser.moviebooking.bookingservice.entity.Movie;
import com.thetrickuser.moviebooking.bookingservice.repository.MovieRepository;
import com.thetrickuser.moviebooking.bookingservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class BookingserviceApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(BookingserviceApplication.class, args);

	}

}
