package com.java.oops.strings.immutable;

public class StringIntro {

	public static void main(String[] args) {

//		String is a group of characters, In Java String is an Object and its immutable
		String str1 = new String();
		System.out.println(str1);// str1 is empty string

		String str2 = new String("The Lion King");
		System.out.println(str2);

		String str3 = "The Lion King";// CP

		String str4 = "The Lion King";

		String str5 = new String("The Lion King");

		String str6 = "the lion king";

		if (str3 == str4) {// == will not compare values, it compares the object reference /address
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		if (str2 == str3) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		if (str3.equals(str4)) {// equals fn/method comapres the values and not the address BUT its case
								// sensitive
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		if (str3.equals(str2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		if (str5.equals(str6)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
		if (str5.equalsIgnoreCase(str6)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

	}

}
