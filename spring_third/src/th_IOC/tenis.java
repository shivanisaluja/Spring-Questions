package th_IOC;

public class tenis implements Coach{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println("in_tenis_class : : "+name);
		
	}

	
	

}
