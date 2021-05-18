package com.mj.customValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//import com.mj.customValidation.CourseCode;

public class CourseCodeConstraintValidation implements ConstraintValidator<CourseCode, String>{
	
	
	private String coursePrefix;
	private String temp[];
	
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		// TODO Auto-generated method stub
		coursePrefix = theCourseCode.value();
		System.out.println("in CourseCodeConstraintValidator_initialize:"+coursePrefix);
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		boolean result=false;
		temp=coursePrefix.split(",");
		System.out.println("in_CourseCodeConstraintValidator..");
		for(String k:temp) {System.out.print(k+ " ");}
		System.out.println("\n\n");
		if(value!=null) {
			
			for(String k:temp) {result=value.startsWith(k);if(result) {break;}}
			
			//result=value.startsWith(coursePrefix);
		}
		else {
			result=true;
		}
		
		return result;
	}
	
	
	

}
