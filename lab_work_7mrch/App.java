package logger_AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
	      
		AccountDemo a = (AccountDemo)context.getBean("accountDemo",AccountDemo.class);
	    System.out.println("in main reult object returneed :"+a.print());
//	    System.out.println("************************************");
//	       B b = (B)context.getBean("b", B.class);
//	       b.print2();
	    
	    
	    X a1 = (X)context.getBean("x",X.class);
		a1.logic();
	   
			System.out.println("\n\nin main reult object returneed :");
		
				a.throwex();
				
				
			
	    
	       context.close();
	}

}
