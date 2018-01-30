package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by S.KENEL on 30.01.2018.
 */
public class SpringHelloApp {
    public static void main(String[] args) {
        //load the spring conf file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from spring container
        Coach myCoach = context.getBean("myCoach",Coach.class);
        //call method on the bean
        System.out.println(myCoach.getDAilyWorkout());
        //close the context
        context.close();
    }
}
