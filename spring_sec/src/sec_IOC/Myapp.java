package sec_IOC;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;



public class Myapp {

	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
						
		
		//another method of loading :
		 //XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("spring.xml")); ​
				// retrieve bean from spring container
				
				
				Coach baseball = (Coach)context.getBean("base");
		 
			//Coach baseball = (Coach)factory.getBean("base", Coach.class);

				
				// call methods on the bean
				System.out.println(baseball.getDailyWorkout());
				
				
				
				System.out.println(baseball.getDailyFortune());
				
				
				Coach baseball1 = (Coach)context.getBean("baseball");
				
				baseball1.print();
				// close the context
				//context.close();

	}

}
