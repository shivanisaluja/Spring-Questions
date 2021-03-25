package fourth;

public class Coach implements ICoach {
	
	Coach(){
		
	}
	
	Coach(Fortune f){
		System.out.println(f.getFortune());
	}

	@Override
	public void getRoutine() {
		// TODO Auto-generated method stub
		System.out.println("Routine");
	}

	public void getSomething() {
		// TODO Auto-generated method stub
		System.out.println("Something");
	}

}
