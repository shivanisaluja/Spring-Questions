package FactoryClassCOncept;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iworker sw=Factory.getObject();
	
		Manager m=new Manager(sw);
		m.ManageWork();

	}

}
