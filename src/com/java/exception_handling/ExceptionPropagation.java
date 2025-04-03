package com.java.exception_handling;

public class ExceptionPropagation {

	public static void main(String[] args) {// DEH

		try {
			a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void a() {
		b();

	}

	private static void b() {
		c();

	}

	private static void c() {// Time Complexity
		System.out.println(0 / 0);
	}

}
