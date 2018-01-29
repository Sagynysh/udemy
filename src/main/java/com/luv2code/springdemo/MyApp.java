package com.luv2code.springdemo;

/**
 * Created by S.KENEL on 29.01.2018.
 */
public class MyApp {
    public static void main(String[] args) {
        Coach theCoach = new TrackCoach();
        System.out.println(theCoach.getDAilyWorkout());
    }
}
