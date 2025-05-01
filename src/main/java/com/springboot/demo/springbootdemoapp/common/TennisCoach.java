package com.springboot.demo.springbootdemoapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach {
    @Override
    public String GetDailyWorkout() {
        return "Practice your backhand";
    }
}
