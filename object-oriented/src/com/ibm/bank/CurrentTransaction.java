package com.ibm.bank;

public class CurrentTransaction extends Transaction {
	
		private double overdraft;
		

	public CurrentTransaction(String txnType, double amount, double balance,double overdraft) {
		super(txnType, amount, balance);
		this.overdraft = overdraft;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\t" + overdraft;
		
	}
	
	

}
