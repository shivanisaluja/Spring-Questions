package com.mj.project1;
public class A {
	
	
	
	private B b;

	public A() {
		System.out.println("in constructor A");
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		System.out.println("in_B_method_from_A");
		this.b = b;
	}

}
