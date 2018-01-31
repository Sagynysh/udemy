package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by S.KENEL on 31.01.2018.
 */
public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
        System.out.println(theCoach.getDAilyWorkout());
        System.out.println(theCoach.getDAilyFortune());
        System.out.println(theCoach.getEmailAdddes());
        System.out.println(theCoach.getTeam());
        context.close();
    }
}
