package com.java.exception_handling;

public class ErrorExample {
	static int counter =0;
	public static void main(String[] args) {
		call();//java.lang.StackOverflowError
		
	}//Merge Sort

	
//	DSA: recursion:  trees, graphs
	private static void call() {//recursion
		System.out.println("Calling for the "+ ++counter + " times");
		call();
		System.out.println("END");
	}

}