package br.com.raxinformatica.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class helloSpringApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve ban from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		//close the context
		context.close();
	}

}