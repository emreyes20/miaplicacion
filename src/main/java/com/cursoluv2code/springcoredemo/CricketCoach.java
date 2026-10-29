package com.cursoluv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Practica el calentamiento dinámico por 10 minutos";
    }
}
