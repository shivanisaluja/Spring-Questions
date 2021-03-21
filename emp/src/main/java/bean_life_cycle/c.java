package bean_life_cycle;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//import org.springframework.beans.factory.annotation.Value;
@Component
@Lazy
public class c {
	
	
	@Override
	public String toString() {
		return "C [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	c(){System.out.println("in_C_cons");}

	String name;
	int id;
	int age;
	
	
//	@Value("20")
//	public c(@Value ("manu") String name, int id, int age) {
//		
//		this.name = name;
//		this.id = id;
//		this.age = age;
//	}

}
