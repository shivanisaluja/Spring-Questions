package ninth;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAspect {

	@Before("execution(* print())")
	public void beforePrint() {
		System.out.println("Order 1");
	}

	@After("execution(* print())")
	public void AfterPrint() {
		System.out.println("Order 1");
	}

}
