package com.ibm.bank;
public class Savings extends Accounts {
	

	public Savings() {
		
	}

	public Savings(String holder) {
		super(holder, MIN_SAVING_BAL);
		
		txns = new Transaction[10];
		txns[idx ++] = new Transaction("Cr", balance, balance);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		
	if(amount < (balance-MIN_SAVING_BAL)) {
		balance -= amount;
		txns[idx ++] = new Transaction("Dr", amount, balance);
	}
	else
			throw new BalanceException("Insufficient balance!");
	}
	
	
}