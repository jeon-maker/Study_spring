package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

	@Bean
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat( "내 이름은 greeter. 입력받은 값은 :  %s");
		return g;
	}
	
	@Bean
	public Greeter greeter1() {
		Greeter g1 = new Greeter();
		g1.setFormat( "my name is greeter1. input value :  %s");
		return g1;
	}

}
