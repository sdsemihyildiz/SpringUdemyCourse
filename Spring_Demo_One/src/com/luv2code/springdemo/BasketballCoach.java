package com.luv2code.springdemo;

public class BasketballCoach implements Coach {
    private FortuneService fortuneService;

    public BasketballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;

    }

    public BasketballCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Work 1 hour of 3 point shots.";
    }

    @Override
    public String getDailyFortune() {
        return "Today is your lucky basketball fortune day.";
    }
}
