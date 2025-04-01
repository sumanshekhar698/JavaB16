package com.java.oops.abstraction;

public class Main {// MySQL Jdbc

	public static void main(String[] args) {

		BankAccount johnAC = new BankAccount("John Wick", 9990008887L);
		System.out.println(johnAC);

//		BankAccountAbstracted johnAC = new BankAccouBankAccountAbstractednt();//Abstract classes cannot be instantiated Directly

		BankAccountImplementation maryAc = new BankAccountImplementation("Mary Jane", 8978978976L);

		BankAccountAbstracted wilsonAc = new BankAccountImplementation("Wilson", 7867786554L);// Upcasting
		// cannot be
		// instantiated
		// Directly

		BankAccountAbstracted john2Ac = new BankAccountAbstracted("John Cornor", 9897866785L) {//Using Anonymous Inner Type
			@Override
			void deposit(long amount) {

				if (amount > 0) {
					this.balance += amount;
				}

				String msg = String.format("Hi, %s \n Your New Balance is %d", name, balance);
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
				LOG.info(msg);
				return 0;

			}
		};

		System.out.println(maryAc);
		System.out.println(wilsonAc);

	}

}
