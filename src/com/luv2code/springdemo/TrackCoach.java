package com.luv2code.springdemo;

public class TrackCoach implements Coach 
{
	FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) 
	{
		fortuneService = theFortuneService;
	}
	
	public TrackCoach() 
	{
		
	}

	@Override
	public String getDailyWorkout() 
	{
		return "Run for 5 Kilometers Daily";
	}

	@Override
	public String getDailyFortune() 
	{
		return "Just Do it : " + fortuneService.getFortune();
	}
	
	// add a init method
	public void doMyStartupStuff()
	{
		System.out.println("TrackCoach : inside doMyStartupStuff method");
	}
	
	// add a destroy method
	public void doMyDestroyStuff()
	{
		System.out.println("TrackCoach : inside doMyDestroyStuff method");
	}
	
}
