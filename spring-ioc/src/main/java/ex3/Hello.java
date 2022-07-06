package ex3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hi")
public class Hello {
private String greeting;
	
	public Hello() {
		System.out.println("default constructor");
	}

	public Hello(String greeting) {
		System.out.println("parameterized constructor");
		this.greeting = greeting;
	}

	public String getGreeting() {
		System.out.println("Getter method");
		return greeting;
	}
	@Value("aloha string")
	public void setGreeting(String greeting) {
		System.out.println("Setter method");
		this.greeting = greeting;
	}
}
