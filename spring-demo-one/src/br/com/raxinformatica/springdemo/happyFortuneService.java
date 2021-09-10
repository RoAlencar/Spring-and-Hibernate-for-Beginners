package br.com.raxinformatica.springdemo;

public class happyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
