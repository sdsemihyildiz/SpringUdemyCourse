package com.semoch.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        // read the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        // Coach theCoach = context.getBean("sillyTennisCoach", Coach.class); commented
        // for making default bean id

        // Coach theCoach = context.getBean("swimCoach", Coach.class);
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
        // call a method ond the bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());

        // close the context
        context.close();
    }

}
