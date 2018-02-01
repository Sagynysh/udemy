package com.luv2code.springdemo;

import java.util.Random;

/**
 * Created by S.KENEL on 31.01.2018.
 */
public class HAppyFortuneService implements FortuneService{
    String [] array = {"Today is lucky day","Today is hard working day","Today is lazy day"};
    Random randomGenerator;
    public HAppyFortuneService(){
        randomGenerator = new Random();
    }
    @Override
    public String getFortune() {
        return array[randomGenerator.nextInt(3)];
    }
}
