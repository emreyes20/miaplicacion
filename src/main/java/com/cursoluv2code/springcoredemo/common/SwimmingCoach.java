package com.cursoluv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Da 15 vueltas completas en la piscina";
    }

}
