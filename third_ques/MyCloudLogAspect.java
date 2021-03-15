package practice.AOP;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAspect {
	@Before("execution(public void classmethod())")
	public void logToCloudAdvice() {
		
	
	System.out.println("Inside MyCloudLogAspect Method");
	}
}
