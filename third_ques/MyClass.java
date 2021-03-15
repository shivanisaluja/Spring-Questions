package practice.AOP;
import org.springframework.stereotype.Component;

@Component("A")
public class MyClass {

	public void classmethod() {
		System.out.println("Inside MyClass Method");
	}
}
