import com.ibm.shop.CartException;
import com.ibm.shop.Product;
import com.ibm.shop.ShoppingCart;

public class TestShopping {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		
		Product p1 = new Product("Airpods",9000);
		try {
			cart.addToCart(p1);
		} catch (CartException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			cart.addToCart(new Product("AppleWatch",22000));
		} catch (CartException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cart.checkOut();

	}

}
