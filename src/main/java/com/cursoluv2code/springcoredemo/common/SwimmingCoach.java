package com.cursoluv2code.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

//Bean predeterminado para inyección
//@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Scope Prototype
public class SwimmingCoach implements Coach {

    public SwimmingCoach(){
        System.out.println("Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Da 15 vueltas completas en la piscina";
    }

}
