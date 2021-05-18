package com.mj.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.mj.customValidation.CourseCode;

public class mymodel {
	
	
	@Pattern(regexp="[0-9a-zA-Z][a-zA-Z]+@[a-zA-Z]+([.][a-z]+)+",message="email requ....invalid email id")
	@NotNull(message="cannot be null")
	String userId; 
	
	
	@Size(min=2,message="minimum 2 characters required")
	String pwd;
	
	
	@Pattern(regexp="(0|91)?[789][0-9]{9}",message="invalid phone No")
	@NotNull(message="Cannot be null")
	String phoneno;
	
	
	String hobby;String sex;
	
	
	@CourseCode(value="CSE,ECE,CSL,SOM",message="enter valid course code")
//	from CSE staring _from mymodel.class
	private String CCode;

	public String getCCode() {
		return CCode;
	}


	public void setCCode(String CCode) {
		this.CCode = CCode;
	}


	public String getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getHobby() {
		return hobby;
	}


	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	public String getUserId() {
		return userId;
	}

	
	public mymodel() {
		
	}

	public mymodel(String userId, String pwd,String hobby,String sex) {
	
		this.userId = userId;
		this.pwd = pwd;
		this.hobby = hobby;
		this.sex = sex;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	


}
