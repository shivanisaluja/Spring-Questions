package Basic_First.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	//this has to run before circle or triangle is called (before)
	
	@Before(" allcircleMethods()  ")
	//joinpoint-- to know whether the method is a getter or setter
	// joinpoint means all the places in your code where you can apply advice
	
	public void LoggingAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.toString());
		System.out.println(joinPoint.getTarget());
	}
	
	
	
	@Before("args(name)")
	public void StringArrgumentMethod(String name)
	{
		System.out.println("A method that takes String Arrguments has been called. The value is"+name);
	}	  
	
//	@Before("allGetters()")
//	public void secondAdvice() {
//		System.out.println("Second Advice executed");
//	}
	
	// execution pointcut 
	//wildcards 
	@Pointcut("execution(public * get*())")
	public void allGetters() {} 
	
	
	@Pointcut("within(Basic_First.model.circle)")
	public void allcircleMethods() {} 
			
	
	
	
			
 
}
 