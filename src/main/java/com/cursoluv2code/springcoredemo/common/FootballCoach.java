package com.cursoluv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy // Inicialización perezosa
public class FootballCoach implements Coach {

    public FootballCoach(){
        System.out.println("Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Da 3 vueltas completas en la cancha";
    }
}
