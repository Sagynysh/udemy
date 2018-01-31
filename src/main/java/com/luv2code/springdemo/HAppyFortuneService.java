package com.luv2code.springdemo;

/**
 * Created by S.KENEL on 31.01.2018.
 */
public class HAppyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is lucky day!";
    }
}
