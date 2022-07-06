import com.ibm.lib.Book;
import com.ibm.lib.Member;

public class TestLibarary {

	public static void main(String[] args) {
		Book b1 = new Book("The Alchemist");
		Member m1 = new Member("polo");

		b1.status();
		m1.status();

		b1.issues(m1);

		b1.status();
		m1.status();
		b1.returns(m1);
		b1.status();
		m1.status();

	}

}
