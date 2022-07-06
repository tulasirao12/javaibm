package com.ibm.bank;
public class Current extends Accounts {
	private double overdraft;
	

	public Current() {
		
	}

	public Current(String holder) {
		super(holder, OPENING_CURRENT_BAL);
		this.overdraft=OVERDRAFT_LIMIT;
		txns = new CurrentTransaction[10];
		txns[idx ++] = new CurrentTransaction("Cr", overdraft, overdraft, overdraft);
		
	}

	@Override
	public void summary() {
		
		super.summary();
		System.out.println("Overdraft:"+overdraft);
	}
	
	@Override
	public void deposit(double amount) {
		overdraft += amount;
		if(overdraft > OVERDRAFT_LIMIT) {
			balance += (overdraft -OVERDRAFT_LIMIT);
		overdraft = OVERDRAFT_LIMIT;
		}
		txns[idx ++] = new CurrentTransaction("Cr", amount, balance, overdraft);
	}
	
	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount <= (balance + overdraft)) {
			balance -= amount;
			if(balance<0){
				overdraft += balance;
				balance=0;
			}
			txns[idx ++] = new CurrentTransaction("Dr", amount, balance, overdraft);
		}else
			throw new BalanceException("Insufficient balance!");
	}

	
	
	
}