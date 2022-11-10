package com.semoch.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
    // create an array of strings

    String[] fortunes = { "Random fortune1", "Random fortune 2", "Random fortune 3", "Random fortune 4" };

    // create a random number generator
    private Random random = new Random();

    @Override
    public String getFortune() {
        // pick a random string from the array

        int index = random.nextInt(fortunes.length);

        String theFortune = fortunes[index];
        return theFortune;
    }

}
