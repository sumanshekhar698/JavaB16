package com.java.basics;

public class Conditionals {

	public static void main(String[] args) {

		int x = 4;

//		Logical AND:&&
//		Logical OR ||
		if (x > 5 || x % 2 == 0) {// if else if else ladder
			System.out.println("Even");
		} else if (x > 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Odd");

		}

		if (x % 2 != 0) {// if else if else ladder
			System.out.println("Odd");
		}

	}

}
