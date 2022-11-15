package withPropertiesFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import withPropertiesFile.service.FortuneService;
import withPropertiesFile.service.SadFortuneService;

@Configuration
//@ComponentScan("beanDefine")
@PropertySource("classpath:sport.properties")
public class SportConfig {


    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // define bean for our swim coach and inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }


}
