package com.java.oops.strings.immutable;

public class CommonMethodsOfStrings {

	public static void main(String[] args) {

//		immutable :: not modifiable

		String str1 = "The Lion King";// 'T' is at 0th posn
		String str2 = " apple ";// 'T' is at 0th posn

		System.out.println(str1.length());

		System.out.println(str1.charAt(2));

//		System.out.println(str1.charAt(-1));

		System.out.println(str1.charAt(str1.length() - 1));

		String str3 = str2.trim();
		System.out.println(str2);//
		System.out.println(str2.length());// 5

		System.out.println(str3);// apple
		System.out.println(str3.length());// 5

		System.out.println(str1.indexOf('i'));

		System.out.println(str1.lastIndexOf('i'));

		String str4 = str1;
		str1 = str1.substring(3);
		System.out.println(str1);

		str1 = str4.substring(4, 8);// start index is inclusive BUT end index is exclusive [start , end -1]
		System.out.println(str1);

		String str6 = "apple IS nice";
		String str7 = str6.toLowerCase();

		System.out.println(str7);

		String str8 = str6.toUpperCase();
		System.out.println(str8);

		System.out.println(str6.contains("IS"));
		
//		String Concatenation 
		
		String word1= "The";
		String word2 = "King";
		
		String word3 = word1.concat(word2);
		System.out.println(word3);
		
		String word4 = "The" + " " + "Lion " + word2;//+ is only operator which is OVERLOADED, it can do mathematical additions and concatenation
		System.out.println(word4);
	}

}
