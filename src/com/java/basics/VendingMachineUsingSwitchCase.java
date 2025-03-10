package com.java.basics;

import java.util.Scanner;

public class VendingMachineUsingSwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// I am creating a Scanner object

		boolean flag = true;

		outer: while (flag) {
			System.out.println("Enter 1: Coke\nEnter 2: Limca\nEnter  3: Water\nEnter 4:Coffee\n 0 for EXIT");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enjoy Coke!");
				break;
			case 2:
				System.out.println("Enjoy Limca!");
				break;
			case 4:
				System.out.println("Enjoy Coffee!");
				break;
			case 3:
				System.out.println("Enjoy Water!");
				break;
			case 0:
				System.out.println("Thank You!!");
//				continue;
//				break outer;
				flag = false;
				break;
//				System.exit(5);//NEVER USE THIS
			default:
				System.out.println("Invalid Input");
				break;
			}

			System.out.println();

		}

//		System.out.println("Thank You !!!");

	}

}
