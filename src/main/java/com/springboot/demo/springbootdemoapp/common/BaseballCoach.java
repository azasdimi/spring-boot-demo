package com.springboot.demo.springbootdemoapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String GetDailyWorkout() {
        return "Spend 30 min in batting practise";
    }
}
