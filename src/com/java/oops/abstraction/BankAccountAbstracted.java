package com.java.oops.abstraction;

import java.util.logging.Logger;

abstract public class BankAccountAbstracted {

	static long noOfAccounts = 0L;
	long acNo;
	String name;
	long phoneNo;
	int balance;
	boolean hasRequestedLoan;
	protected static final Logger LOG = Logger.getLogger(BankAccount.class.getName());

	public BankAccountAbstracted(String name, long phoneNo) {
		super();
		this.acNo = ++noOfAccounts;
		this.name = name;
		this.phoneNo = phoneNo;
	}

	long checkBalance() {
		String msg = String.format("Hi, %s \n Your Balance is %d", name, balance);
		LOG.info(msg);
		return balance;
	}

	abstract void deposit(long amount);// 0 to 100%

	abstract long withdraw(long amount);

	@Override
	public String toString() {
		return "BankAccount [acNo=" + acNo + ", name=" + name + ", phoneNo=" + phoneNo + ", balance=" + balance
				+ ", hasRequestedLoan=" + hasRequestedLoan + "]";
	}

}
