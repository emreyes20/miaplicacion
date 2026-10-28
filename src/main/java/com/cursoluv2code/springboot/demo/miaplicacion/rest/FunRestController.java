package com.cursoluv2code.springboot.demo.miaplicacion.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Se expone un endpoint "/" que retorna un 'Hola Mundo'

    @GetMapping("/")
    public String sayHello(){
        return "Hola Mundo!";
    }

    // Se expone otro nuevo endpoint llamado "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Trabajando duro!";
    }

    // Se expone otro nuevo endpoint llamado "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Hoy es tu día de suerte!";
    }
}
