package com.luv2code.springdemo;

/**
 * Created by S.KENEL on 29.01.2018.
 */
public class BaseballCoach implements Coach {

    private FortuneService fortuneService;
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDAilyWorkout(){
        return "Spend 30 minutes on batting  practice";

    }

    @Override
    public String getDAilyFortune() {
        return fortuneService.getFortune();
    }
}
