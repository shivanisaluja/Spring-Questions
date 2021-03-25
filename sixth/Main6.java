package sixth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		A a1=(A)context.getBean("a");
		System.out.println(a1);
		A a2=(A)context.getBean("a");
		System.out.println(a2);
		
		((AbstractApplicationContext) context).close();
		
	}

}
