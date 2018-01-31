package com.luv2code.springdemo;

/**
 * Created by S.KENEL on 31.01.2018.
 */
public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    public CricketCoach(){

    }

    @Override
    public String getDAilyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDAilyFortune() {
        return "Criecket can do it! "+fortuneService.getFortune();
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
