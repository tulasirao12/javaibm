public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c = new Customer("hello",43558);
		Customer c2 = new Customer("hi",54992);
		Customer c3 = new Customer();
		c.showDetails();
		c2.showDetails();
		c3.showDetails();
	}

}