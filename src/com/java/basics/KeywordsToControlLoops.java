package com.java.basics;

public class KeywordsToControlLoops {

	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) {

			if (i >= 500) {
				break;//breaking the  loop

			}
			System.out.println(i);// if i will cross 500

		}

		for (int i = 0; i < 100; i++) {

			if (i % 10 == 0) {
				continue;//skipping iteration

			}
			System.out.println(i);// if i will cross 500

		}
		
		
//		TODO: continue and break in while loops

	}

}
