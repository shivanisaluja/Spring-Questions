package logger_AOP;

import org.springframework.stereotype.Component;

@Component("accountDemo")
public class AccountDemo {
	public int print() {
		System.out.println("A Class Print");
		return 1000;
	}
	
	
	public void throwex() {
		System.out.println("in throwable method()...");
	    throw new IllegalArgumentException();
		
		
	}
	
	
}
