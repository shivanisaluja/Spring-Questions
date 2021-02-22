package managerExample2;

public class Manager {
	Iworker iw;
	public Manager(Iworker mw) {
		
		iw=mw;

	}
	public void ManageWork() {
		iw.work();
	}
	

}
