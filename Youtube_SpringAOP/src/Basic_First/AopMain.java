package Basic_First;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Basic_First.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Spring.xml");
		ShapeService shapeser=ctx.getBean("shapeser",ShapeService.class);
		shapeser.getCir().setName("Dummy name");
		System.out.println(shapeser.getCir().getName());
		System.out.println(shapeser.getTri().getName());
		
	
	}

}
