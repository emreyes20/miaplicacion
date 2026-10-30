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

    //Se define otro atributo
    private Coach anotherCoach;


    @Autowired
    public DemoController(
            @Qualifier("swimmingCoach") Coach coach,
            @Qualifier("swimmingCoach") Coach otherCoach){
        System.out.println("Constructor: " + getClass().getSimpleName());
        myCoach = coach;
        anotherCoach = otherCoach;
    }

    // Nuevo endpoint que compara los beans
    @GetMapping("/check")
    public String check(){
        return "Comparación de beans: myCoach == anotherCoach, " +
                (myCoach == anotherCoach);
    }

    // Nuevo endpoint que usa la dependencia Coach
    @GetMapping("/daily-workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
