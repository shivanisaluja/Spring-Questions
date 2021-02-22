package LooseCoupling;

public class Manager {
	Iworker iw;
	
	
	public Manager(Iworker sw) {
		iw=sw;
	}
	
	public void ManageWork() {
		iw.work();
	}

}
