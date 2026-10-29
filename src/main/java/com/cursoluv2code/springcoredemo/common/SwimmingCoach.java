package com.cursoluv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //Bean predeterminado para inyección
public class SwimmingCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Da 15 vueltas completas en la piscina";
    }

}
