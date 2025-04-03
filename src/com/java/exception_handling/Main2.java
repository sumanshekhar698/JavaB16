package com.java.exception_handling;

import java.util.Scanner;

public class Main2 {
//6/0, 0/0
	public static void main(String[] args) {

		System.out.println("START");
		Scanner sc = new Scanner(System.in);

		int[] nums = { 23, 21, 213213, 2132, 212, 23 };

		int input = sc.nextInt();

		try {
			System.out.println(nums[6 / input]);
			return;
		}

		catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {// JAVA 8
			e.printStackTrace();
		} catch (Exception e) {// default catch block
			e.printStackTrace();
		} finally {//finally executes at any cost
			System.out.println("finally!!");
			sc.close();
		}

//		sc.close();

		System.out.println("END");

	}

}
