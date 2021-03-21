package bean_life_cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.*;

@Component("a")
@Scope("singleton")


// lazy init method using annotation part......
@Lazy
public class a {
	
	
	
	b obj;

	public b getObj() {
		return obj;
	}
	@Autowired
	public void setObj(b obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "A [obj="+obj.hashCode() + obj + "]";
	}
	
	
	//public void setNa(String b) {obj.setN(b);}
	
	a(){System.out.println("in_A_cons");}
	
	@PostConstruct
	public void init() {
		System.out.println("in_start_method_start()");
	}
	
	@PreDestroy
	public void destroymy() {
		System.out.println("in_destroy_method_destroy()");
	}
	

}
