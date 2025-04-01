package com.java.oops.abstraction.interfaces;

public class BankAcoountImple implements BankAccountInterface {

	private static long noOfAccounts = 0L;// auto increment at the DB level
	final long acNo;
	final String name;
	long phoneNo;
	private int balance;
	boolean hasRequestedLoan;

	@Override
	public void deposit(long amount) {

		if (amount > 0) {
			this.balance += amount;
		}

		String msg = String.format("Hi, %s \n Your New Balance is %d", name, balance);
//			System.out.println(msg);
		LOG.info(msg);
	}

	@Override
	public long withdraw(long amount) {// sl4j , log4j
		if (amount < this.balance) {
			this.balance -= amount;
			return amount;
		} else {
			LOG.warning("Insuficient Balance");
		}
		String msg = String.format("Hi, %s \n Your Current Balance is %d", name, balance);
//			System.out.println(msg);
		LOG.info(msg);
		return 0;

	}

	public BankAcoountImple(String name, long phoneNo) {
		super();
		this.acNo = ++noOfAccounts;
		this.name = name;
		this.phoneNo = phoneNo;

	}

	@Override
	public String toString() {
		return "BankAccountImplementation [acNo=" + acNo + ", name=" + name + ", phoneNo=" + phoneNo + ", balance="
				+ balance + ", hasRequestedLoan=" + hasRequestedLoan + "]";
	}

	@Override
	public long checkBalance() {
		String msg = String.format("Hi, %s \n Your Balance is %d", name, balance);
//		System.out.println(msg);
		LOG.info(msg);
//		System.out.println("Balance :: " + balance);
		return balance;
	}

}
