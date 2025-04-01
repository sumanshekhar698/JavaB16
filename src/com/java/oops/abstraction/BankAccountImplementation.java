package com.java.oops.abstraction;

import java.util.logging.Logger;

public class BankAccountImplementation extends BankAccountAbstracted {

	@Override
	void deposit(long amount) {

		if (amount > 0) {
			this.balance += amount;
		}

		String msg = String.format("Hi, %s \n Your New Balance is %d", name, balance);
//			System.out.println(msg);
		LOG.info(msg);
	}

	@Override
	long withdraw(long amount) {// sl4j , log4j
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

	public BankAccountImplementation(String name, long phoneNo) {
		super(name, phoneNo);
	
	}

	@Override
	public String toString() {
		return "BankAccountImplementation [acNo=" + acNo + ", name=" + name + ", phoneNo=" + phoneNo + ", balance="
				+ balance + ", hasRequestedLoan=" + hasRequestedLoan + "]";
	}
	
	



}
