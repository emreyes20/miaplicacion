package com.cursoluv2code.springcoredemo.rest;

import com.cursoluv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Definir un atribut privado para la dependencia
    private Coach myCoach;

    // Constructor para la inyección de dependenica
    // Omitir @Autowired si solo hay un constructor
    @Autowired
    public DemoController (Coach coach){
        myCoach = coach;
    }

    // Nuevo endpoint que usa la dependencia Coach
    @GetMapping("/daily-workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
