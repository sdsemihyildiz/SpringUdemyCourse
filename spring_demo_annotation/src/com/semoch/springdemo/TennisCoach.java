package com.semoch.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component("sillyTennisCoach")  commented for making default bean id

@Component
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    /*
     * Commented for setter injection
     * 
     * @Autowired
     * public TennisCoach(FortuneService theFortuneService){
     * fortuneService=theFortuneService;
     * }
     * 
     */

    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor.");
    }

    /*
     * Commented for field injection
     * 
     * @Autowired
     * public void doSomeCrazyStuff(FortuneService theFortuneService) {
     * System.out.println("TennisCoach inside method injection.");
     * this.fortuneService = theFortuneService;
     * }
     */

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley.";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }

    /*
     * Commented for Method injection
     * 
     * @Autowired
     * public void setFortuneService(FortuneService fortuneService) {
     * System.out.println("TennisCoach inside setter injection.");
     * this.fortuneService = fortuneService;
     * }
     */
}
