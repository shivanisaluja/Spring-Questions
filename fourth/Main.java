package fourth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Coach coach=(Coach)context.getBean("base");
		Cricket cricket = (Cricket)context.getBean("cricket");
		Address address = (Address)context.getBean("address");
//		Tennis tennis = (Tennis)context.getBean("tennis");
//		Tennis tennis1 = (Tennis)context.getBean("tennis");
		
		coach.getDailyW();
		coach.getDailyFortune();
		
		cricket.getEmail();
		
		address.getState();
//		
//		tennis.setName("1");
//		tennis1.setName("2");
//		
//		tennis.getName();
//		tennis1.getName();
	}

}
