package com.java.oops.abstraction.interfaces.speciasl;


@FunctionalInterface// FunctionalInterfaces are special interface with only ONE abstract fn
public interface Bird {

//	JAVA 8
	
	void fly();//
	
//	void run();
	
	default void eat(){//default fn that has body
		System.out.println("Bird is eating");
	}
	
	static void sleep(){//static fn in interface
		System.out.println("Bird is sleeping");
	}
}
