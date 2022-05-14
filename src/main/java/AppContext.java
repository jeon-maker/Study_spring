package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

	@Bean
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat( "안녕하세요!, %s");
		return g;
	}
	@Bean
	public Greeter greeter1() {
		Greeter g = new Greeter();
		g.setFormat( "안녕하세요!, %s");
		return g;
	}

}
