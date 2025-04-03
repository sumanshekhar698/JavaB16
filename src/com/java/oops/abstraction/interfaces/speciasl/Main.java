package com.java.oops.abstraction.interfaces.speciasl;

public class Main {

	public static void main(String[] args) {

		Bird b1 = new Bird() {

			@Override
			public void fly() {
				System.out.println("Flying..");

			}
		};
		
		b1.fly();

		// Functional Inteface
//		Lambda Fn

		Bird b2 = () -> {//		Lambda Fn only applicable fore functional interface
			System.out.println("Flying high..");
		};
		b2.fly();

	}

}
