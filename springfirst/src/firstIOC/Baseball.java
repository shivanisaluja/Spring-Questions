package firstIOC;

public class Baseball implements Coach {
	private iFortune ifortune;
	public Baseball(iFortune ifortune) {
		
		this.ifortune=ifortune;
		
	}
public String getDailyWorkout() {
	return "Hello_from_baseball";
}

@Override
public String getDailyFortune() {
	return ifortune.getFortune();
}
}
