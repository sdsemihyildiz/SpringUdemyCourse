package com.semoch.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// @Component("sillyTennisCoach")  commented for making default bean id

@Component
//@Scope("prototype")
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

    //define init method
    @PostConstruct
    public void doMyStartupStaff() {
        System.out.println(">> TennisCoach: inside of doMyStartUpStaff");
    }

    // define destroy method
    @PreDestroy
    public void doMyCleanUpStaff() {
        System.out.println(">> TennisCoach: inside of doMyCleanUpStaff");
    }

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
