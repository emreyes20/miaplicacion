package com.cursoluv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Da 3 vueltas completas en la cancha";
    }
}
