package com.mj1.emp;

public class emp {
	
	@Override
	public String toString() {
		return "emp [d=" + d + ", a=" + a + "]";
	}
	
	
	department d;
	address a ;
	
	
	
	public department getD() {
		return d;
	}
	public void setD(department d) {
		this.d = d;
	}
	public address getA() {
		return a;
	}
	public void setA(address a) {
		this.a = a;
	}
	
	

}
