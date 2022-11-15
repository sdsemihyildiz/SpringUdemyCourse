package Practice;

import Practice.service.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class LoveCoach implements Coach {

    @Value("${semoch.email}")
    private String email;
    @Value("${semoch.team}")
    private String team;


    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    private FortuneService fortuneService;

    public LoveCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Write poem.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
