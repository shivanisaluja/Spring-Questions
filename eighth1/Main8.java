package eighth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(JConfig.class);
		
		X x = (X)context.getBean("x");
		
		x.logic();
		
		((AbstractApplicationContext) context).close();
	}

}
