package com.springboot.demo.springbootdemoapp.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("TennisCoach constructor");
    }

    @Override
    public String GetDailyWorkout() {
        return "Practice your backhand";
    }
}
