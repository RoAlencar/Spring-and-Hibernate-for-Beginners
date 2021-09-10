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

	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	//add an destroy method
		public void doMyCleanupStuffYoYo() {
			System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
		}
}
