package com.springboot.demo.springbootdemoapp.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("TennisCoach constructor");
    }

//    //define our init method
//    @PostConstruct
//    public void doMyStartupStuff() {
//        System.out.println("TennisCoach doMyStartupStuff");
//    }
//
//    //define our destroy method
//    @PreDestroy
//    public void doMyShutdownStuff() {
//        System.out.println("TennisCoach doMyShutdownStuff");
//    }

    @Override
    public String GetDailyWorkout() {
        return "Practice your backhand";
    }
}
