package com.java.basics;

public class WhileLoops {

	public static void main(String[] args) {

		int i = 1;
//		odd till 10007

		while (i <= 10007) {
//			if (i % 2 != 0) {
			System.out.print(i + " ");
//			}

			i += 2;

		}

		
		
		do {//it will run at least one iteration
			System.out.println("dooooooo");
		} while (9 == 6);

	}

}
