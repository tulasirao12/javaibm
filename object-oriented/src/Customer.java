public class Customer {
	private  int custId;
	private  String custName;
	private  double creditLimit;
	private static int count=1001;
	public Customer() {
		this("Anonymas",0);
	}
	public Customer(String name,double limit) {
		custId = count++;
		custName = name;
		creditLimit = limit;
		
	}
	public void showDetails() {
		System.out.println("Customer id: "+custId+"\tCustomer name: "+custName+"\tCreditLimit: " +creditLimit);
	}
}	