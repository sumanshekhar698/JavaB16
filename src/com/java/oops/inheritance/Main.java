package com.java.oops.inheritance;

import com.java.static_concept.Gender;

public class Main {

	public static void main(String[] args) {

		IPLPlayer vk = new IPLPlayer("Virat Kohli", 40, Gender.MALE, false, 18, "(RCB)INDIA", 34550, 0, 170);
		System.out.println(vk);
		
		vk.canRetire();
//		vk.health();

	}

}
