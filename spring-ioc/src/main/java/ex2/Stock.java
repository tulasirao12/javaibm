package ex2;

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
