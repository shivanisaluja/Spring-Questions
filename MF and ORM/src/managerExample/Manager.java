package managerExample;

public class Manager {
	SmartWorker sw=new SmartWorker();
	LazyWorker lw=new LazyWorker();
	ExtraordinaryWorker ew=new ExtraordinaryWorker();
	 public Manager(SmartWorker sw,LazyWorker lw) {
		 this.sw=sw;
		 this.lw=lw;
		 this.ew=ew;
		 
	 }
	 public void ManageWork(){
		 sw.work();
		 lw.work();
		 ew.work();
		 
	 }
	

}
