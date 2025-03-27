package com.java.oops.inheritance;

public class StaticInheritance extends Foo {
	
//	@Override static fn cannot be overidden

	static void say() {//	Method Hiding
		System.out.println("say StaticInheritance");
	}
	
	
	public static void main(String[] args) {
		StaticInheritance staticInheritance = new StaticInheritance();
		System.out.println(staticInheritance.x);
		staticInheritance.say();
		StaticInheritance.say();
		Foo.say();

	}
}

class Foo {
	static int x = 99;

	static void say() {
		System.out.println("say Foo");
	}
}
