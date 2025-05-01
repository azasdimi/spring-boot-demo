package com.springboot.demo.springbootdemoapp.rest;

import com.springboot.demo.springbootdemoapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    //define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach coach,
                          @Qualifier("tennisCoach") Coach coach2) {
        myCoach = coach;
        anotherCoach = coach2;
    }

//    @Autowired
//    public void setCoach(Coach coach) {
//        myCoach = coach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.GetDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: coach == anotherCoach: " + (myCoach == anotherCoach) ;
    }
}
