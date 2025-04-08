package com.java.advanced.io.serialization;

import java.io.Serializable;

//record
//Serializable :: marker interfaces
public class Student implements Serializable {// LOMBOK

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	// static private String name;//Static things don't take in part in
	// Serialization
	private String name;// private things are serialized
	transient private int age;// transient variables cannot be Serialization

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
