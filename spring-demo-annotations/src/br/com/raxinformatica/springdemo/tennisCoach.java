package br.com.raxinformatica.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class tennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
