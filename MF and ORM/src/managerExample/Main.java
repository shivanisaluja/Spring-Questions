package managerExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazyWorker lw=new LazyWorker();
		SmartWorker sw=new SmartWorker();
		ExtraordinaryWorker ew=new ExtraordinaryWorker();
		Manager m=new Manager(sw,lw);
		m.ManageWork();

	}

}
