import com.ibm.bank.AccountsFactory;
import com.ibm.bank.BalanceException;
import com.ibm.bank.Bank;

public class TestAccounts {

	public static void main(String[] args) {
	/*	Accounts a1 = new Accounts("Sam",4000);
		a1.summary();
		
		a1.deposit(2000);
		a1.summary();
		
		a1.withdraw(3000);
		a1.summary();
		
		a1.withdraw(5000);*/
		
	/*	Savings s1 = new Savings("keis");
		s1.summary();
		s1.deposit(1000);
		s1.summary();
		s1.deposit(2000);
		s1.summary();
		s1.withdraw(1000);
		s1.summary();
		s1.statement();*/
		/*Current c1 = new Current("mohan");
		c1.deposit(10000);
		c1.summary();
		c1.withdraw(8000);
		c1.summary();
		c1.withdraw(7000);
		c1.summary();
		c1.withdraw(1000);
		c1.summary();
		c1.deposit(3000);
		c1.summary();
		c1.statement();*/
		
		Bank  s1 = AccountsFactory.openSavings("polo");
		
		try {
			s1.withdraw(1000);
		} catch (BalanceException e) {
			
			//e.printStackTrace();
			//System.out.println(e);
			System.out.println(e.getMessage());
		}
			
		
	/*	s1.summary();
		s1.deposit(2000);
		s1.summary();
		
		s1.withdraw(1000);
		s1.summary();
		
		s1.deposit(7000);
		s1.withdraw(5000);
		
		s1.statement();*/
		
		/*Bank c1 = AccountsFactory.openCurrent("jack");
		
		c1.summary();
		c1.deposit(4000);
		c1.summary();
		
		c1.withdraw(2000);
		c1.summary();
		
		c1.deposit(1000);
		c1.withdraw(9000);
		
		c1.statement();
		
		*/
		
		
		
		
		
		
	}

}
