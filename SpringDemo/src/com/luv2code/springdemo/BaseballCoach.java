package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    //define a private field for dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;

    }

    public BaseballCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice.";
    }

    @Override
    public String getDailyFortune() {
        // use my fortune service to get a fortune
        return fortuneService.getFortune();
    }

}
