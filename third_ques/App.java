package practice.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		MyClass A=context.getBean("A",MyClass.class);
		
		// call the business method
		A.classmethod();

		
		// close the context
		context.close();
    }
}
