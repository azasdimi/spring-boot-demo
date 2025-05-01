package com.springboot.demo.springbootdemoapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("CricketCoach constructor");
    }
    @Override
    public String GetDailyWorkout() {
        return "Practice fast bolwing for 15min123";
    }
}
