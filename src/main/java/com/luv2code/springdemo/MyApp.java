package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by S.KENEL on 29.01.2018.
 */
public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("myCoach",Coach.class);

//        Coach theCoach = new TrackCoach();
        System.out.println(theCoach.getDAilyWorkout());
    }
}
