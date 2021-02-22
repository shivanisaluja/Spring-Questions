package LooseCoupling;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iworker sw=new SmartWorker();  // upcasting
	
		Manager m=new Manager(sw);
		m.ManageWork();

	}

}
