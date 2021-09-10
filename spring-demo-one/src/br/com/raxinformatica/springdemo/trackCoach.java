package br.com.raxinformatica.springdemo;

public class trackCoach implements Coach {

	private FortuneService fortuneService;
	
	public trackCoach() {
	}
	
	public trackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It: " + fortuneService.getFortune();
	}

}
