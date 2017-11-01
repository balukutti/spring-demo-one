package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) 
	{
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		
		// call methods on the bean
		System.out.println("Your track  daily workout is : "+ trackCoach.getDailyWorkout());
		System.out.println("Your daily workout is : "+ baseballCoach.getDailyWorkout());

		//Lets call fortune method
		System.out.println("Your baseball fortune is : "+baseballCoach.getDailyFortune());
		System.out.println("Your track fortune is : "+trackCoach.getDailyFortune());
		// close the context
		context.close();
	}

}
