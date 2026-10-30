package com.cursoluv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

//@Primary //Bean predeterminado para inyección
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Scope Prototype
public class SwimmingCoach implements Coach {

    public SwimmingCoach(){
        System.out.println("Constructor: " + getClass().getSimpleName());
    }

    // Definir el método de inicialización
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("Haciendo cosas de inicialización = " + getClass().getSimpleName());
    }

    // Definir el método de destrucción
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("Haciendo cosas de destrucción = " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout(){
        return "Da 15 vueltas completas en la piscina";
    }

}
