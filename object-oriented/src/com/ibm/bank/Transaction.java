package com.ibm.bank;

public class Transaction {
	private String txnType;
	private double amount;
	private double balance;
	
	public Transaction(String txnType, double amount, double balance) {
		
		this.txnType = txnType;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return txnType + "\t" + amount + "\t" + "\t" + balance;
	}
	
	//public void print() {
	//	System.out.println(txnType + "\t" + amount + "\t" + "\t" + balance);
	//}
	
	
	
}
