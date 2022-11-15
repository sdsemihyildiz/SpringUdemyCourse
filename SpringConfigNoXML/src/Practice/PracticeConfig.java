package Practice;

import Practice.service.FortuneService;
import Practice.service.LoveFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:practice.properties")
public class PracticeConfig {

    @Bean
    public FortuneService loveFortuneService() {
        return new LoveFortuneService();
    }

    @Bean
    public Coach loveCoach() {
        return new LoveCoach(loveFortuneService());
    }


}
