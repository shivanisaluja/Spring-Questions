package logger_AOP;

import org.springframework.stereotype.Component;

@Component("x")
public class X {
	
	public void logic() {
		
		for(int i=0;i<=10;i++) {
			System.out.println("x class is :"+i);
		}
		
	}

}
