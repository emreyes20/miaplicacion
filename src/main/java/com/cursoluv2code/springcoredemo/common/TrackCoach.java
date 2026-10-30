package com.cursoluv2code.springcoredemo.common;

public class TrackCoach implements Coach {

    public TrackCoach(){
        System.out.println("Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Corre 5km";
    }
}
