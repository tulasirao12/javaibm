package com.ibm.bank;
/**
 * this class represents generalized bank account
 * @author venkata tulasi rao
 * version 1.o
 *
 */
public abstract class Accounts implements Bank{

	private int acntNo;
	private String holder;
	protected double balance;
	private static int autogen = INIT_ACNT_NO;
	protected Transaction[] txns;
	protected int idx;
	
	/**
	 * Default constructor.
	 */
	public Accounts() {
		
	}
	/**
	 * Parameterized constructor.
	 * @param holder
	 * @param balance
	 */
	public Accounts(String holder, double balance) {
		super();
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;
		
		
		
	}
	/**
	 * summary method gives account information.
	 */
	public void summary() {
		System.out.println("A/C No: "+acntNo);
		System.out.println("Holdler: "+holder);
		System.out.println("Balance:" +balance);
	}
	//Business Logic methods
	/**
	 * deposit method for depositing amount
	 */
	public void deposit(double amount) {
		balance += amount;
		txns[idx ++] = new Transaction("Cr", amount, balance);
	}
	/**
	 * withdraw method for withdrawing amount.
	 */
	public void withdraw(double amount) throws BalanceException {
		if(amount<=balance) 
			balance -= amount;
			
		else 
			throw new BalanceException("Insufficient balance!");
		
	}
	/**
	 * Statement method for getting history transactions.
	 */
	public void statement() {
		System.out.println("Statement of A/C No\t:"  + acntNo);
		for( int i =0; i<idx; i++) {
			System.out.println(txns[i]);
		}
	}
	
	

}