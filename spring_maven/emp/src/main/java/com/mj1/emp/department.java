package com.mj1.emp;

public class department {
	
	@Override
	public String toString() {
		return "department [name=" + name + ", id=" + id + "]";
	}
	String name;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
