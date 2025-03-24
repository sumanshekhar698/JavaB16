package com.java.oops.encapsulation;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		
		final int x  = 9;// final with local var
		final int y;
		
		y = 0;
//		y = 9;
//		x = 10;
		
		
//		LocalDate.parse static call
		UniversityStudent st1 = new UniversityStudent("John", 3, LocalDate.parse("1997-05-21"));
		System.out.println(st1);
		System.out.println(st1.toString());
//		st1.dob = LocalDate.now();
		System.out.println(st1);

		System.out.println(st1.getDob());// setters and getters can give indirect access to private instance variables
//		st1.sayMyName();


	}

}
