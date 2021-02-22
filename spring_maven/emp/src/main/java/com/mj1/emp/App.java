package com.mj1.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	
    	 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
         emp ob_a=(emp)context.getBean("emp_1");
         
         System.out.println(ob_a.toString());
        
        
    }
}
