package fourth;

public class Cricket{
	private String email;
	private String team;
	
	Cricket(String team){
		this.team=team;
		System.out.println("team");
	}
	public void getEmail() {
		System.out.println(email);
	}

	public void setEmail(String email) {
		
		System.out.println("in setter email");
		this.email = email;
	}

}
