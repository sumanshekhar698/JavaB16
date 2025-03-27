package com.java.oops.inheritance;

public class A {

	int x = 10;

	public static void main(String[] args) {

		C c = new C();
		c.readX();

	}

}

class B extends A {
	int x = 11;
}

class C extends B {
	int x = 12;

	void readX() {
		System.out.println(x);
		System.out.println(super.x);
//		System.out.println(super.super.x);

	}
}

//class X extends Y {
//
//}
//
//class Y extends X {
//
//}