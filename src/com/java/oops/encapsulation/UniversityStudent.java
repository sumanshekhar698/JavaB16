package com.java.oops.encapsulation;

import java.time.LocalDate;

public class UniversityStudent {

//	Access Modifiers
	/*
	 * - private - default - protected - public
	 */

	String name;
	private int id;// by default its default
//	final private LocalDate dob = LocalDate.now();// private things cannot be accessed directly outside the class
	final private LocalDate dob;// private things cannot be accessed directly outside the class

//	final with instance variables should be be insatntiated in the constructor or directly hardcoded

	public UniversityStudent(String name, int id, LocalDate dob) {
		this.name = name;
		this.id = id;
		this.dob = dob;
		
		sayMyName();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return "UniversityStudent [name=" + name + ", id=" + id + ", dob=" + dob + "]";
	}

	public LocalDate getDob() {
		return dob;
	}

	private void sayMyName() {
		System.out.println("Name : " + name +" object created.");
	}

//	public void setDob(LocalDate dob) {
//		this.dob = dob;
//	}

}
