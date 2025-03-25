package com.java.static_concept;

import java.util.Arrays;

public class Main2 {

//	Main2.main({});
	public static void main(String[] suman) {// var args

		System.out.println(suman.length);
		System.out.println(Arrays.toString(suman));

		System.out.println(Student.collegeName);// static things should be accessed via Class name

		Student st1 = new Student("John", 2, "Delhi University", "DTU", Gender.MALE);
		System.out.println(st1);
		System.out.println(Student.collegeName);

		call("Java");
		call("Python", 453, 234, 23);
		call("C++", 32, 23, 23, 23, 23, 23, 23, 234);
		call("Rust", 231, 1, 1, 123, 12, -23);

		
		System.out.println(PlayerNames.PLAYER_1);
	}

	public static void main(Integer[] args) {

	}

	static void call(String word, int... nums) {// var args should always be at the last
		System.out.println(word);
		System.out.println(Arrays.toString(nums));

	}

}
