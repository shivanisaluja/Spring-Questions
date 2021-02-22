package th_IOC;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;



public class Myapp {

	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
						
		
		//another method of loading :
		 //XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("spring.xml")); ​
				// retrieve bean from spring container
			
			System.out.println("just_for_testing()");
				
			Coach baseball123 = (Coach)context.getBean("baseball1");
			
				Coach baseball1 = (Coach)context.getBean("baseball");
				
				
				System.out.println(baseball1.toString());
				
				
				//by singleton ...
				System.out.println("for singleton.....");
				
				Coach obj1 = (Coach)context.getBean("tenis");
								
				obj1.setName("1");   
								
								
				Coach obj2 = (Coach)context.getBean("tenis");
				
				obj2.setName("2");				
				System.out.println(obj1.getName());
				System.out.println(obj2.getName());
				
				//by prototype...
				
				System.out.println("for protoype.....");
				
				Coach obj3 = (Coach)context.getBean("newtenis");
				
				obj3.setName("1");		
								
								
				Coach obj4 = (Coach)context.getBean("newtenis");
				
				obj4.setName("2");	
				
				Coach obj5 = (Coach)context.getBean("newtenis"); obj5.setName("3");	
				System.out.println(obj3.getName());
				System.out.println(obj4.getName());
				System.out.println(obj5.getName());
				
				
				

				// close the context
				//((AbstractApplicationContext) context).close();
				// close method is included in ClassPathXmlApplicationContext class--> so downcasting must
				((ClassPathXmlApplicationContext)context).close();

	}

}
