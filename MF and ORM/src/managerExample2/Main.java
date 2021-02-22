package managerExample2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iworker sw=Factory.getObject();
		
		Manager m=new Manager(sw);
		
		m.ManageWork();

	}

}
