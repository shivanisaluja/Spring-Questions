package AOP_sec;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class address {
	
	private String hno;private String city;



	public String getHno() {
		return hno;
	}


	@Value("123,gurgaon")
	public void setHno(String hno) {
		this.hno = hno;
	}



	public String getCity() {
		return city;
	}


	@Value("NCR")
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
