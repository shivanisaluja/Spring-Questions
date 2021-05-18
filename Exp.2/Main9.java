package ninth;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main9 {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Moviesdata obj1 = (Moviesdata) context.getBean("mov");
		Idao obj = (Idao) context.getBean("ida");

		try {
			obj.addMovies(obj1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("After adding: ");
		
		obj.viewMovies(obj1);
		
		obj.updateMovies(obj1);
		
		System.out.println("After updation: ");

		obj.viewMovies(obj1);

		obj.deleteMovies(obj1);
		
		System.out.println("After deletion: ");
		
		obj.viewMovies(obj1);
	}
}
