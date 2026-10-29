package com.cursoluv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Practica 30 minutos bateando la pelota";
    }
}
