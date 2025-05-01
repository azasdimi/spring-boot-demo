package com.springboot.demo.springbootdemoapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("TennisCoach constructor");
    }

    @Override
    public String GetDailyWorkout() {
        return "Practice your backhand";
    }
}
