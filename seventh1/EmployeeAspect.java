package seventh;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {

	@Before("execution(* getName() )")
	public void beforeGetName() {
		System.out.println("Before getName()");
	}
	
	@After("execution(* setName(..))")
	public void afterSetName() {
		System.out.println("After setName()");
	}
	
//	@AfterReturning(pointcut = "execution(* getName(..))", returning = "r")
//	public void afterSetName(String r) {
//		System.out.println("After getName()");
//		System.out.println(r);
//	}
	
	@Around("execution(* calculate_sal())")
	public void aroundCalculate_sal(ProceedingJoinPoint j) {
		System.out.println("Around(before) calculate_sal()");
		try {
			j.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Around(after) calculate_sal()");
	}

}
