package practice.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyApiAnalyticsAspect {
	@Before("execution(public void classmethod())")
public void performApiAnalyticsAdvice() {
	
System.out.println("Inside MyApiAnalytics Method");
}
}
