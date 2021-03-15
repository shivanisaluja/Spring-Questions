package AOP_sec;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class mainapp {

	public static void main(String a[]) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
	
	// get the bean from spring container
	emp theAccountDao=context.getBean("emp",emp.class);
	
	
	
	// call the business method
	theAccountDao.setName("mj");
	
	
	

	System.out.println("get name is :"+theAccountDao.getName());

	//System.out.println("\nlet's call it again!\n");
	
	theAccountDao.cal_sal();
	
			
	// close the context
	context.close();
	
	
	
	}
	
	
}
