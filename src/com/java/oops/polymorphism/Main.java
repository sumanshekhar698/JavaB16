package com.java.oops.polymorphism;

public class Main {

	public static void main(String[] args) {
		ShapePolymorphic shapePolymorphic = new ShapePolymorphic();
		System.out.println(shapePolymorphic.area(8));

		System.out.println(shapePolymorphic.area(8.8));

		System.out.println(shapePolymorphic.area(8.8f, 9));

	}

}
