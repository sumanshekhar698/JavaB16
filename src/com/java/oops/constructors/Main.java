package com.java.oops.constructors;

import com.java.oops.encapsulation.UniversityStudent;

public class Main {

	public static void main(String[] args) {

		Car c1 = new Car();

		System.out.println(c1.color);//
		System.out.println(c1.mielage);//
		System.out.println(c1.topSpeedInKmph);//
		System.out.println(c1);

		c1.breaks();
		c1.accelerate();

		c1.topSpeedInKmph = 100;
		int topSpeed = c1.accelerateBeyond(10);
		System.out.println(topSpeed);

		Car c2 = new Car("Red", 130, 20.4f);
//		c2.Car("Red", 130, 20.4f);//constructors are triggered automatically while creating object and cannot be triggered manually later on
		System.out.println(c2.color);//
		System.out.println(c2.mielage);//
		System.out.println(c2.topSpeedInKmph);//
		System.out.println(c2);
		Car carC2This = c2.exploreThis();
		System.out.println(carC2This);
		
//		UniversityStudent st1 = new UniversityStudent(null, topSpeed, null);


	}

}

class Car {

	String color;// null is default value for every object
	int topSpeedInKmph;// 0
	float mielage;// 0.0

//	Constructor

//	 * 1. A constructor is like a fn with no return type 
//	 * 2. A constructor name should exactly match the class Name 
//	 * 3. If there are NO constructors defined explicitly, Java will create a default constructor in the runtime 
//	 * 4. A constructor can be parameterized or non parameterized
//	 * 5. Constructor are of 2 types [Parameterized and Non Parameterized)
//	 * 6. A class can have multiple constructors if there are no ambiguity
//	 * 7. constructors help in creating objects
//	 * 8. constructors are triggered automatically while creating object and cannot be triggered manually later on
//	 * 9. this(...) should be the 1st statement in the constructor while Constructor Chaining
//	 * 10. this(..) wil be only one in a given constructor
//	 * 11. this is a keyword in Java and it points to the current object

	
//	Car constructor is overloaded
	Car() {// Not Parameterized Constructor
//		this("blue",999,10); //Don't do a Cyclic chaining
		System.out.println("Car() constructor called");
	}

	Car(String color, int topSpeedInKmph, float mielage) {// Parameterized Constructor
		this(color, topSpeedInKmph);
		System.out.println("Car(String color, int topSpeedInKmph, float mielage) constructor called");

//		Shadow Problem
		this.color = color;// this is a keyword in Java and it points to the current object
		this.topSpeedInKmph = topSpeedInKmph;
		this.mielage = mielage;
	}

	Car(String color, int topSpeedInKmph) {// Parameterized Constructor
		this();// this(.. ) should always be the 1st statement in the Constructor Chaining
		System.out.println("Car(String color, int topSpeedInKmph) constructor called");
		System.out.println(color);
		System.out.println(topSpeedInKmph);
	}

	void breaks() {// fn | methods
		System.out.println("Breaks applied!!");

	}

	void accelerate() {
		System.out.println("Accelerating ...!!");

	}

	int accelerateBeyond(int speed) {
		if (speed <= topSpeedInKmph)
			System.out.println("Accelerating to ...!!" + speed);
		else {
			System.out.println("Cannot Accelerate ...!!");

		}

		return topSpeedInKmph;
	}
	
	Car exploreThis(){
		System.out.println(this);
		return this;
		
	}

}
