package br.com.raxinformatica.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
			ClassPathXmlApplicationContext context =
					new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean form spring container
			Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		// call a method on the bean
			System.out.println(theCoach.getDailyWorkout());
		// close the context
			context.close();
	}

}
