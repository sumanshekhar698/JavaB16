package com.java.basics;

import java.util.Iterator;

public class ForLoopInJava {

	public static void main(String[] args) {
		// print even numbers from 0 to 100005

//		System.out.println(0);
//		System.out.println(2);
//		System.out.println(4);
//		System.out.println(6);

//		SCOPE of Variables

		int x = 9;

//		int i = 0;

		int i = 0;
		for (i = 0; i <= 100005; i++) {// int i = 0; i <= 100005; i++ | declaration; condition; updation

			if (i % 2 == 0)
				System.out.print(i + " ");
		}
		int j;
		for (j = 1; j > 0; j += 1000) {
			System.out.println(j);

		}

		System.out.println(j);
//		System.out.println(i);

	}

}
