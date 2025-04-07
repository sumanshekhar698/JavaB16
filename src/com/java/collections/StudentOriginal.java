package com.java.collections;

public class StudentOriginal  {

	String name;
	int rollNo;

	public StudentOriginal(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}

	
}
