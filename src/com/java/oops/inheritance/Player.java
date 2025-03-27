package com.java.oops.inheritance;

import com.java.static_concept.Gender;

public class Player extends Object {
//	public class Player {
	String name;
	int age;
	Gender gender;

	boolean canRetire() {
		if (age > 55) {
			System.out.println("Retired");
			return true;
		} else {
			System.out.println("Not Retired");
			return false;
		}
	}

	private void health() {

	}

	final void age() {
		System.out.println("age: " + age);
	}

	public Player(String name, int age, Gender gender) {
//		super();

		System.out.println("Player() called");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

}
