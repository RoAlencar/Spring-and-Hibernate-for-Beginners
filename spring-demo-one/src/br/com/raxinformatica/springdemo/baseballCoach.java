package br.com.raxinformatica.springdemo;

public class baseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting pratice";
	}
}
