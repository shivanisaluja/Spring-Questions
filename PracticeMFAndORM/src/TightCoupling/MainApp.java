package TightCoupling;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Smart_Worker sw=new Smart_Worker();
		Lazy_Worker lw= new Lazy_Worker();
		ExtraOrdinary_Worker ew=new ExtraOrdinary_Worker();
		Manager mn = new Manager (sw, lw, ew);
		mn.ManageWork();
		
	}

}
