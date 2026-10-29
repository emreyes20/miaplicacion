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


    /*

    // Inyección de dependencias mediante constructor
    // Omitir @Autowired si solo hay un constructor
    @Autowired
    public DemoController (Coach coach){
        myCoach = coach;
    }
     */

    // Inyección de dependencias mediante setter
    /*
    @Autowired
    public void setCoach(Coach coach){
        myCoach = coach;
    }
     */

    // Inyeccion de dependencias con @Qualifier
    @Autowired
    public DemoController (@Qualifier("swimmingCoach") Coach coach){
        myCoach = coach;
    }

    // Nuevo endpoint que usa la dependencia Coach
    @GetMapping("/daily-workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
