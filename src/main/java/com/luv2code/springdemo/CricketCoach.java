package com.luv2code.springdemo;

/**
 * Created by S.KENEL on 31.01.2018.
 */
public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    private String emailAdddes;
    private String team;
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

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAdddes(String emailAdddes) {
        System.out.println("Spring emailAddress setted "+emailAdddes);
        this.emailAdddes = emailAdddes;
    }

    public void setTeam(String team) {
        System.out.println("Spring team setted "+team);
        this.team = team;
    }

    public String getEmailAdddes() {
        return emailAdddes;
    }

    public String getTeam() {
        return team;
    }
}
