package com.luv2code.springdemo;

public class SoftwareCoach implements Coach{
    private FortuneService fortuneService;

    public SoftwareCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    public SoftwareCoach(){

    }
    public void initMethod(){
        System.out.println("Init method test");
    }
    public void destroyMethod(){
        System.out.println("Destroy method test");
    }


    @Override
    public String getDailyWorkout() {
        return "Make 3 hours of code practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
