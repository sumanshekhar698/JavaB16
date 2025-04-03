package com.java.exception_handling;

import java.util.Scanner;

public class Main {
//6/0, 0/0
	public static void main(String[] args) {

		System.out.println("START");
		Scanner sc = new Scanner(System.in);

		
		//Unchecked: no one is forcing you to handle
		//Checked: yopu are forced to handle
		
		
		int[] nums = { 23, 21, 213213, 2132, 212, 23 };
		
		

		int input = sc.nextInt();
//		System.out.println(nums[6 / input]);

		try {
			System.out.println(nums[6 / input]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {// default catch block
			e.printStackTrace();
		}

		System.out.println("END");

	}

}
