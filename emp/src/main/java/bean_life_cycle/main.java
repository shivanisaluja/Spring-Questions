package bean_life_cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class main {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("spring_123.xml");
		
		
		
		a baseball = (a)context.getBean("a");
		 
		
			
			System.out.println(baseball.toString());
		
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
