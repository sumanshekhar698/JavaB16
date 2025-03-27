package com.java.oops.inheritance;

import com.java.static_concept.Gender;

public class IPLPlayer extends Player {
//	public class Child extends Parent {

	boolean isAllRounder;
	int jersey;
	String country;
	int runs;
	int wickets;
	int matchesPlayed;

//	R1: Inheritance works from top to bottom
//	R2: Instance variables and methods/fn can be inherited
//	R3: You have to call the parent constructor from the child
//	R4: super points to the IMMEDIATE parent
//	R5: super() should be the 1st statement in the constructor
//	R6: super() cannot be used with this() and ViceVersa
//	R7: Multiple Inheritance is NOT allowed in Java via extends keyword because of Diamond shape Problem
//	R8: Multilevel Inheritance is allowed in Java
//	R9: Cyclic Inheritance is allowed in Java
//	R10: final classes cannot be extended
//	R11: final method/fn cannot be overridden
//	R12: private fn cannot be inherited
//	R13: static things take part in inheritance
//	R14: static methods/fn cannot be overriden but then be hidden

	public IPLPlayer(String name, int age, Gender gender, boolean isAllRounder, int jersey, String country, int runs,
			int wickets, int matchesPlayed) {

		super(name, age, gender);// super points to the IMMEDIATE parent
//		this();
		System.out.println("IPLPlayer() called");
		this.isAllRounder = isAllRounder;
		this.jersey = jersey;
		this.country = country;
		this.runs = runs;
		this.wickets = wickets;
		this.matchesPlayed = matchesPlayed;
	}

	@Override
	public String toString() {
		return "IPLPlayer [isAllRounder=" + isAllRounder + ", jersey=" + jersey + ", country=" + country + ", runs="
				+ runs + ", wickets=" + wickets + ", matchesPlayed=" + matchesPlayed + ", name=" + name + ", age=" + age
				+ ", gender=" + gender + "]";
	}

	@Override
	boolean canRetire() {// This is determined in the Runtime :: Runtime Polymorphism
		if (age > 55) {
			System.out.println("Retired");
			return true;
		} else {
			System.out.println("Still Playing");
			return false;
		}
	}

//	void age() {//final method/fn cannot be overridden
//		System.out.println("age: " + age);
//	}

}
