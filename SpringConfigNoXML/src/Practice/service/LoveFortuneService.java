package Practice.service;

import org.springframework.stereotype.Component;

@Component
public class LoveFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "You will get your love.";
    }
}
