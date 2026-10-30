package com.cursoluv2code.springcoredemo.config;

import com.cursoluv2code.springcoredemo.common.Coach;
import com.cursoluv2code.springcoredemo.common.TrackCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    // Puedes personalizar el nombre de tu bean
    // Ejemplo: @Bean("track")
    @Bean ("track")
    public Coach trackCoach(){
        return new TrackCoach();
    }

}
