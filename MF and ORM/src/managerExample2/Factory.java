package managerExample2;
import java.util.ResourceBundle;
public class Factory {
	private Factory(){}
	public static Iworker getObject() {
		return new SmartWorker();
		
	}

}
