package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by S.KENEL on 01.02.2018.
 */
public class beanlifecycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        Coach theCoach = context.getBean("myCoach",Coach.class);
        System.out.println(theCoach.getDAilyFortune());
        System.out.println(theCoach.getDAilyFortune());

        context.close();
    }
}
