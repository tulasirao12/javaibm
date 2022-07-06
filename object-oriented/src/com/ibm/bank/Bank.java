package com.ibm.bank;

public interface Bank {
	//constants of the application
	 int INIT_ACNT_NO=12001;
	 double MIN_SAVING_BAL=1000;
	 double OPENING_CURRENT_BAL=5000;
	 double OVERDRAFT_LIMIT=10000;
	 
	 // Behaviors of the application
	 void deposit(double amount);
	 void withdraw(double amount) throws BalanceException;
	 void summary();
	 void statement();
	 
}
