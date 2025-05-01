package com.springboot.demo.springbootdemoapp.common;


public class BaseballCoach implements Coach {

    public BaseballCoach() {
        System.out.println("BaseballCoach constructor");
    }
    @Override
    public String GetDailyWorkout() {
        return "Spend 30 min in batting practise";
    }
}
