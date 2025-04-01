package com.java.oops.abstraction.interfaces;

import java.util.logging.Logger;

interface BankAccountInterface {

//	static long noOfAccounts = 0L;//all these variables in an interfaces in public static final by default
//	long acNo;
//	String name;
//	long phoneNo;
//	int balance;
//	boolean hasRequestedLoan;

	String PARENT_BANK = "RBI";

	static final Logger LOG = Logger.getLogger(BankAccountInterface.class.getName());

	long checkBalance();// by default all the abstract in a interface

	abstract void deposit(long amount);// 100% Abstraction

	abstract long withdraw(long amount);

}
