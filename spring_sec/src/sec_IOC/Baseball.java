package sec_IOC;


public class Baseball implements Coach{
	
	
	private iFortune fortune;
	
	private String name;
	private int team;
	private int age;

	
	
	
	public void setfortune9(iFortune fortune) {
		
		this.fortune=fortune;
		
	}
	
	public iFortune getfortune9() {
		
		return fortune;
		
	}
	
	public Baseball() {
		System.out.println("in_default_baseball()");
	}
	
	
	public Baseball(String name, int team, int age) {
			this.name = name;
			this.team = team;
			this.age = age;
		}

public String getDailyWorkout() {
	return "Hello_from_baseball";
}

public String getDailyFortune() {
	return fortune.getFortune();
}


public void print() {
	
	System.out.println("name is :"+name+" age is:"+age+" team no is : "+team );
	
}

}
