package AOP_sec;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class empAspect {
	
	
	@Pointcut("execution(public void cal_sal())")
	private void test1() {}
	
	@Before("execution(public String getName() )") //this will not execute cuz both aspect cannot run at same time
	public void beforeMethod() {
		System.out.println("this_is_called_before_callign_t. ");
		
	}
	
	
	
	@After("execution(public void setName())")//aspect
	public void afterMethod() {// advice
		System.out.println("this_is_called_after_callign_.. ");
		
	}
	
	
	
	@Around("test1()")//aspect
	public void AccountDevice(ProceedingJoinPoint pt) {// advice
		
		System.out.println("before cal_sal aspect mehod..");
		try {
			pt.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("after cal_sal aspect mehod..");
		
	}
	
	
	
}