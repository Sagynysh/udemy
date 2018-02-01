package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by S.KENEL on 01.02.2018.
 */
public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach theCoach = context.getBean("myCoach",Coach.class);
//        System.out.println(theCoach.getDAilyFortune());
//        System.out.println(theCoach.getDAilyWorkout());
        Coach alphaCoach = context.getBean("myCoach",Coach.class);
        boolean result  = (theCoach == alphaCoach);
        System.out.println("\nThe object is the same is "+result);
        System.out.println("\n Memory location for theCoach "+theCoach);
        System.out.println("\n Memory location for alphaCoach "+alphaCoach);


    }
}
