package FactoryClassCOncept;

import java.util.ResourceBundle;

public class Factory {
	
		private static ResourceBundle rb = ResourceBundle.getBundle("config");
		private Factory() {}
		static Iworker getObject(){
		Object object=null;
		String classname=rb.getString("class-name");
		
		try {
			object=Class.forName(classname).getDeclaredConstructor().newInstance();}
		
		catch(Exception e) {}
			return(Iworker)object;
		}
			
		
		
		
	}


