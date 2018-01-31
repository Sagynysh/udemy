package com.luv2code.springdemo;

/**
 * Created by S.KENEL on 29.01.2018.
 */
public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    public TrackCoach(){
    }

    public TrackCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;

    }
    @Override
    public String getDAilyWorkout(){
        return "Run a hard 5k";

    }

    @Override
    public String getDAilyFortune() {
        return "Just do it! "+fortuneService.getFortune();
    }
}
