package th_IOC;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

public class Baseball implements Coach{
	
	private String name;
	private int team;
	private int age;
	
	private String na;
	private Address a;

	public String getNa() {
		return na;
	}

	public void setNa(String na) {
		this.na = na;
	}

	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	public Baseball() {
		System.out.println("in_default_baseball()\n\n NOTE: this is called before intit()");
		//System.out.println("in_default_baseball()");
	}
	
	
	public Baseball(String name, int team, int age) {
			this.name = name;
			this.team = team;
			this.age = age;
		}

	

	

	@Override
	public String toString() {
		return "Baseball [name=" + name + ", team=" + team + ", age=" + age + ", na=" + na + ", a=" + a + "]";
	}

	@Override
	public void print() {
		System.out.println("in_print()_of_baseball");
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String a) {
		// TODO Auto-generated method stub
		
	}
	
	//remember init & destroy method donot return anything nor do they accept any parameter
	public void startinit() {System.out.println("in_init_method()");}

	public void startdestroy() {System.out.println("in_destroy_method()");}


}
