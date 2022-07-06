package ex1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
	
	@Test
	public void testGreeting() {
		ApplicationContext appctx = new ClassPathXmlApplicationContext("ex1ctx.xml");
		 Hello h = (Hello) appctx.getBean("hi");
		 System.out.println("Greeting : " +h.getGreeting());
	}
	@Test
	public void testGreeting2() {
		ApplicationContext appctx = new ClassPathXmlApplicationContext("ex1ctx2.xml");
		 Hello h = (Hello) appctx.getBean("hi");
		 System.out.println("Greeting : " +h.getGreeting());
	}
}
