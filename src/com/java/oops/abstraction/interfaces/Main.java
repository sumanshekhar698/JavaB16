package com.java.oops.abstraction.interfaces;

public class Main {

	public static void main(String[] args) {


		BankAcoountImple raviAC = new BankAcoountImple("Ravi", 876866545L);
		System.out.println(raviAC);
		
		BankAccountInterface bankAccountInterface = new BankAccountInterface() {
			
			@Override
			public long withdraw(long amount) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void deposit(long amount) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public long checkBalance() {
				// TODO Auto-generated method stub
				return 0;
			}
		};

	}

}
