package com.luv2code.springdemo;

public class CricketCoach implements Coach 
{

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String name;
	
	public CricketCoach() 
	{
		System.out.println("CricketCoach : inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) 
	{
		System.out.println("CricketCoach : inside the setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() 
	{
		return "Practice fast bowling daily!!";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside the set email Address method");
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
