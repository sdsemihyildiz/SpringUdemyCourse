package com.semoch.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneSerivce implements FortuneService {

    @Override
    public String getFortune() {
        // TODO Auto-generated method stub
        return "Database fortune service";
    }

}
