package com.java.exception_handling;

public class ThrowsKeyword {

	public static void main(String[] args) {//DEH

		try {
			a();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void a() throws InterruptedException {
		b();

	}

	private static void b() throws InterruptedException {
		c();

	}

	private static void c() throws InterruptedException {//Time Complexity

		for (int i = 0; i < 10; i++) {
//			try {
				Thread.sleep(1000);
//			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}// Checked Exception
			System.out.println(i);
		}

	}

}
