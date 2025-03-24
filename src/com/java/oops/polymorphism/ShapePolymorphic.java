package com.java.oops.polymorphism;

public class ShapePolymorphic {

//	The should be no ambiguity among the fn names
//	1. no on params
//	2. type of params
//	3. position of the type of param
	
//	only parameters take part in polymorphism

	
//	area fn is overloaded
	
//	1. compile time: [METHOD OVERLOADING] method/fn call resolves in compilation phase
//	2. runtime:  [METHOD OVERRIDING]
	int area(int side) {
		return side * side;
	}

	double area(double radius) {
//		return 3.14159 * radius * radius;

		return Math.PI * radius * radius;

	}

	int area(int l, int b) {
		return l * b;
	}

	float area(int base, float height) {
		return 0.5f * base * height;
	}

	float area(float height, int base) {//parallelogram
		return base * height;
	}

}
