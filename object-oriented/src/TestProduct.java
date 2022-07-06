import com.ibm.shop.Product;

public class TestProduct {

	public static void main(String[] args) {
		
		Product p1 = new Product("mobile", 5000);
		p1.description();
		
		
		Product p2 = new Product("laptop",20000);
		p2.description();
	}

}