package TightCoupling;

public class Manager {
	Lazy_Worker lw;
	Smart_Worker sw;
	ExtraOrdinary_Worker ew;
	
	
	public  Manager(Smart_Worker sw , Lazy_Worker lw , ExtraOrdinary_Worker ew) {
		this.sw=sw;
		this.lw=lw;
		this.ew=ew;
		
	}
	
	
	public void ManageWork() {
		sw.work();
		lw.work();
		ew.work();
	}

}
