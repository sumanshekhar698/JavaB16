package com.java.oops.strings.mutable;

public class Main {

	public static void main(String[] args) {

		String str = " The Lion king";
		str += 9;
		str.trim();// TODO What Strings are kept mutable in Java
		System.out.println(str);
		
//		StringBuilder
//		StringBuffer
		
		StringBuilder sb = new StringBuilder("The ");
		sb.append("Lion");
		sb.append(" King ");
		sb.append(1969);
		
		System.out.println(sb);
		
		sb.delete(0, 2);
		System.out.println(sb);
		
		String str2 = "apple";
		StringBuffer sb2 = new StringBuffer("Apple");//Buffer is ThreadSafe and is used in MT env
		
		if(str2.equalsIgnoreCase(sb2.toString())) {
			System.out.println("Equals");
		}
		
//		USE Mutable strings if you are modifying too many times the originals String data

		

	}

}
