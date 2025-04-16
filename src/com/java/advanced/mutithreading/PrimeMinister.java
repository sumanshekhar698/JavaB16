package com.java.advanced.mutithreading;

public class PrimeMinister {// Singleton pattern [Design Patterns]

	String name;
	int age;
	static private PrimeMinister pm;

	private PrimeMinister(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	static synchronized PrimeMinister electMyPM(String name, int age) {//this fn can be accessed one Thread at a time

		if (pm == null) {
			pm = new PrimeMinister(name, age);
		}

		return pm;

	}

	@Override
	public String toString() {
		return "PrimeMinister [name=" + name + ", age=" + age + "]";
	}

}
