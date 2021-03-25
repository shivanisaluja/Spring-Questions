package seventh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Employee emp = (Employee)context.getBean("employee");
		System.out.println(emp.toString());
		
		((AbstractApplicationContext) context).close();
	}

}
