package com.java.basics;

public class PrimitiveDataTypesInJava {
//	https://www.geeksforgeeks.org/data-types-in-java/
	public static void main(String[] args) {

//		Decimal Numbers: 10 sybols [0-9]
//		1. Numerical/Integer Data

//		1 bit = 0 or 1

//		-2^(n-1) to 0 to 2(n-1) - 1
		byte a = 9;// 1 byte = 8 bits
		short b = 89;// 2 bytes = 16 bits
		int c = 8880;// 4 bytes = 32 bits MOST PREFRED
		long d = 89088;// 8 bytes = 64 bits
		int x = -789;

		System.out.println(Byte.MAX_VALUE);// Inbuilt Constants
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);// 9223372036854775807

		long phoneNumber = 9_006_567_388L;//9006567388

//		a = b;
		c = a;
		d = x;
//		x = d;
		int binaryNo = 0b01010101;//2 symbols [0,1]
		System.out.println(binaryNo);//Printing is always in Decimal format
		int octalNo = 01246;// 8 symbols [0-7]
		System.out.println(octalNo);//Printing is always in Decimal format
		int hexadecimalNo = 0X1246AC7;// 16 symbols [0-9 + A-F]
		System.out.println(hexadecimalNo);//Printing is always in Decimal format 19163847

//		2. Floating Point Data
		float valueOfPi = 3.14159F;// 4 bytes
		double valueOfPi2 = 3.14159;// 8 bytes
		System.out.println(valueOfPi2);
		System.out.println(valueOfPi);

		float phoneNoFloat = phoneNumber;// Edge Scenario !!!!
		System.out.println(phoneNoFloat);// 9.006567E9 9.006567 * 10*9 = 9006567000 ACCURACY LOSS

//		3. Boolean
		boolean isJavaEasy = false;// 1 byte
		isJavaEasy = true;

//		4. Character
//		UTF8 = 1 byte
		char ch = '*';// UTF16 Unicode Transformation Format uses 2 bytes
		System.out.println(ch);
		System.out.println((int)ch);

		char rupee = '₹';
		System.out.println((int)rupee);
		System.out.println((char)90909);
		
		

	}

}
