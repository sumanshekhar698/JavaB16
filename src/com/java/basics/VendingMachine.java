package com.java.basics;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// I am creating a Scanner object

		while (true) {
			System.out.println("Enter 1: Coke\nEnter 2: Limca\nEnter  3: Water\nEnter 4:Coffee\n 0 for EXIT");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("Enjoy your Coke");
			} else if (choice == 2) {
				System.out.println("Enjoy your Limca");

			} else if (choice == 3) {
				System.out.println("Enjoy your Water");
			} else if (choice == 4) {
				System.out.println("Enjoy your Coffee");
			} else if (choice == 0) {
				break;

			}
			System.out.println();

		}
		
		System.out.println("Thank You !!!");

	}

}
