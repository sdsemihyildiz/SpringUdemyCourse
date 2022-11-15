package withoutXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import withoutXml.service.FortuneService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// @Component("sillyTennisCoach")  commented for making default bean id

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;


    public TennisCoach() {
        System.out.println(">> withoutXml.TennisCoach: inside default constructor.");
    }


    //define init method
    @PostConstruct
    public void doMyStartupStaff() {
        System.out.println(">> withoutXml.TennisCoach: inside of doMyStartUpStaff");
    }

    // define destroy method
    @PreDestroy
    public void doMyCleanUpStaff() {
        System.out.println(">> withoutXml.TennisCoach: inside of doMyCleanUpStaff");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley.";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}