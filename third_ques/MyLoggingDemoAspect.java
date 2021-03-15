package practice.AOP;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyLoggingDemoAspect {
	@Before("execution(public void classmethod())")
	public void beforeAddAccountAdvice() {

	
	System.out.println("Inside MyLoggingDemoAspect Method");
	}
}
