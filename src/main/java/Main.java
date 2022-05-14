package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppContext.class);
		Greeter g = ctx.getBean("greeter", Greeter.class);
		Greeter g3 = ctx.getBean("greeter1", Greeter.class);
		String msg = g.greet("스프링");
		String msg1 = g3.greet("spring");
		System.out.println(msg);
		System.out.println(msg1);
		System.out.println(String.format("hi ", 10));
		ctx.close();

	}
}