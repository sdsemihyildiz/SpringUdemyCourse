package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeBeanLifeCycleApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("PracticeBeanLifeCycleApplicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());

        /*
        boolean check = (theCoach == alphaCoach);
        System.out.println("\nPointing to the same object: " + check);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
        */


        context.close();
    }
}
