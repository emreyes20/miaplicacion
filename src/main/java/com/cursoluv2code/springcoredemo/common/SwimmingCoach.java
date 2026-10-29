package com.cursoluv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

//Bean predeterminado para inyección
//@Primary
public class SwimmingCoach implements Coach {

    public SwimmingCoach(){
        System.out.println("Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Da 15 vueltas completas en la piscina";
    }

}
