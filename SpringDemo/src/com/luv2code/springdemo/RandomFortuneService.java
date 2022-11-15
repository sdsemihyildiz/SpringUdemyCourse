package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {


    private String[] data = {"Random fortune 1", "Random fortune 2", "Random fortune 3"};
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }

}
