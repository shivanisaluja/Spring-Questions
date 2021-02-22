package firstIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Myapp {

	public static void main(String[] args) {
		// spring interface 
		// load the spring configuration file
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
						
		
		//another method of loading :
		// XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("applicationContext.xml")); ​
				// retrieve bean from spring container
				Coach theCoach = (Coach)context.getBean("myCoach", Coach.class);
				
				Coach cricket = (Coach)context.getBean("mycricket");
				
				// call methods on the bean
				System.out.println(theCoach.getDailyWorkout());
				
				
				System.out.println(cricket.getDailyWorkout());
				// let's call our new method for fortunes
				System.out.println(theCoach.getDailyFortune());
				
				
				texteditor te1 = (texteditor)context.getBean("te");
				
				te1.te();
				te1.checkspell();
				
				// close the context
				//context.close();
				
				
				

}
}
