package fourth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("fourth")
public class ConfigApp {

	@Bean
	public ICoach coach() {
		return new Coach();
	}

	@Bean
	public Coach ccoach() {
		return new Coach();
	}
	
	@Bean
	public Fortune fortune() {
		return new Fortune();
	}
	
	@Bean
	public Coach ccc() {
		return new Coach(fortune());
	}

}
