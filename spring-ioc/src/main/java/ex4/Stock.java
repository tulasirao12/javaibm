package ex4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stk")
@Scope("singleton")
public class Stock {

	private static Stock s;
	
	public Stock() {
		System.out.println("Stock constructor");
}
	
	public static Stock get() {
		System.out.println("stock singleton");
		if(s==null) {
			s = new Stock();
		}
		return s;
	}
}
