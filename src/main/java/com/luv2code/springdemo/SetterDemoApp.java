package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by S.KENEL on 31.01.2018.
 */
public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("myCricketCoach",Coach.class);
        System.out.println(theCoach.getDAilyWorkout());
        System.out.println(theCoach.getDAilyFortune());
        context.close();
    }
}
