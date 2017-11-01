package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println("Daily Fortune is : " + cricketCoach.getDailyFortune());
		System.out.println("Daily Workout is : " + cricketCoach.getDailyWorkout());
		
		System.out.println("Email Address is : "+cricketCoach.getEmailAddress());
		System.out.println("Team Name is : "+cricketCoach.getName());
		
		context.close();
	}
}
