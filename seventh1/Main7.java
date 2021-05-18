package seventh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(JConfig.class);

		Employee emp = (Employee) context.getBean("emp");

		emp.setName("GB");

		emp.getName();

		emp.calculate_sal();

		((AbstractApplicationContext) context).close();

	}

}
