package br.com.raxinformatica.springdemo;

public class cricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// create a no-arg constructor
	public cricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Pratice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
