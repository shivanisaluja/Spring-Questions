package AOP_sec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class emp {
	
	private String name;private String age;private address add;private String no_of_days_working;
	private int sal=0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		sal=1000;
	}
	public String getAge() {
		return age;
	}
	@Value("12")
	public void setAge(String age) {
		this.age = age;
	}
	public address getAdd() {
		return add;
	}
	
	
	@Autowired
	@Qualifier("address")
	public void setAdd(address add) {
		this.add = add;
	}
	public String getNo_of_days_working() {
		return no_of_days_working;
	}
	@Value("365")
	public void setNo_of_days_working(String no_of_days_working) {
		this.no_of_days_working = no_of_days_working;
	}
	
	public void cal_sal() {System.out.println("in sal method..()"+sal);}

}

