package com.thetrickuser.moviebooking.bookingservice.service;

import com.thetrickuser.moviebooking.bookingservice.entity.Screen;
import com.thetrickuser.moviebooking.bookingservice.repository.ScreenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScreenService {

    @Autowired
    private ScreenRepository screenRepository;

    public Screen addScreen(Screen screen) {
        return screenRepository.save(screen);
    }
}
