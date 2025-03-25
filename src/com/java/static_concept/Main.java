package com.java.static_concept;

public class Main {

	public static void main(String[] args) {

		
		System.out.println(Student.collegeName);//static things should be accessed via Class name
		
		
		Student st1 = new Student("John", 2, "Delhi University", "DTU", Gender.MALE);
		System.out.println(st1);
		System.out.println(Student.collegeName);


		Student st2 = new Student("Jane", 12, "Delhi University", "Lady Shriram College", Gender.FEMALE);
		System.out.println(st2);
		System.out.println(Student.collegeName);

		Student st3 = new Student("Jim", 5, "Delhi University", "Indrapastha College", Gender.MALE);
		System.out.println(st3);
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(Student.collegeName);
		System.out.println(st1.collegeName);// you can access static things via obj ref, but this is not a good way

		
		
		System.out.println();
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(Student.collegeName);
		
		st1.collegeName = "Amity";
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(Student.collegeName);
		System.out.println(st1.collegeName);// you can access static things via obj ref, but this is not a good way
		
		

	}

}
