package fourth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

		ICoach c = context.getBean("coach", Coach.class);

		c.getRoutine();
		
		Coach cc = context.getBean("ccoach", Coach.class);
		
		cc.getSomething();
		
		Coach ccc = context.getBean("ccc",Coach.class);

		((AbstractApplicationContext) context).close();
	}

}
