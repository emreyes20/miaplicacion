package com.cursoluv2code.springcoredemo.rest;

import com.cursoluv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Definir un atributo
    private Coach myCoach;

    @Autowired
    public DemoController (@Qualifier("track") Coach coach) {
        System.out.println("Constructor: " + getClass().getSimpleName());
        myCoach = coach;
    }

    // Nuevo endpoint que usa la dependencia Coach
    @GetMapping("/daily-workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
