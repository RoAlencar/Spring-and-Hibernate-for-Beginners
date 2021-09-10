package br.com.raxinformatica.springdemo;

public class myApp {

	public static void main(String[] args) {
		
		// create the object
		Coach theCoach = new trackCoach(null);
		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
