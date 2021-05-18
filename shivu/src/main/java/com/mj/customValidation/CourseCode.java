package com.mj.customValidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//import com.mj.customValidation.CourseCodeConstraintValidation;

@Constraint(validatedBy = CourseCodeConstraintValidation.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	

	public String value() default "CSE";
	
//define default error message -> if we do not specify an mesage tag in mymodel class then this default msg will get printed on jsp
	public String message() default "u have to start with CSE_hello from @interface";
	
	// define default groups
	public Class<?>[] groups() default {};
	
	// define default payloads
	public Class<? extends Payload>[] payload() default {};

}
