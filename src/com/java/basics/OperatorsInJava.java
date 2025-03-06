package com.java.basics;

public class OperatorsInJava {

	public static void main(String[] args) {

		int x = 9;// '=' assignment operator

//		arithmetic operator +,-,*,/,%
		x = x + 8;
		System.out.println(x);

		int z = 101;
		System.out.println(z / 5);// 20 quotient
		System.out.println(z % 5);// 1 remainder

//		unary operator
		x = 100;
		x++;// POST increment operator [first use the value and then increase by 1]
		System.out.println(x);// 101
		++x;// PRE increment operator [first increase by 1 the value and then use]
		System.out.println(x);// 102
		System.out.println(x++);// ? (print 102) ---after printing---> 103
		System.out.println(++x);// ? 103 ---> 104 (print 104)

		x = 100;
		System.out.println(x--);// POST decrement print 100 ---> 99
		System.out.println(--x);// PRE decrement 99--> 98 print 98
//		x =98
		System.out.println(x++);// print 98 98---> 99
		System.out.println(x);// print 99

		x = 100;// 102 ---> 247
		z = 80;// 79
		x = x-- + --z + ++x - z-- + ++z + x++ - --z - z++ + ++x;
//		x = 100 + 79 + 100 - 79 + 79 + 100 - 78 - 78 + 102 = 325
		System.out.println(x);// 2 mins
		System.out.println(z);

//		shorthand operators
		x++;
		x = x + 1;
		x = x + 2;
		x += 2;

		x = 15;
		x /= 3;
		System.out.println(x);

//		comparison operators ==> boolean 
		System.out.println(x == z);// == > < >= <= != FiraCode --> font lignatures

//		bitwise operators
		System.out.println(6 | 9);// bitwise OR
		System.out.println(6 & 9);// bitwise AND
		System.out.println(6 ^ 9);// bitwise XOR
		System.out.println(6 ^ 6);// bitwise XOR
		System.out.println(~9); // bitwise NOT

		
		short m  = 8;
//		8 to binary
//		 0 0001000   0 0000001
		System.out.println(8 >> 3); // bitwise Right Shift
//		 8 /2   /2  /2
		
//		 0 0001000   0 0100000 
		System.out.println(8 << 2); // bitwise Left Shift
//		 8 *2   *2
		
		
		int ans = 0b0000001;
		System.out.println(ans);
		
		int ans2 = 0b0100000;
		System.out.println(ans2);
		
//		Signed RIGHT shifting
		System.out.println(8 >>> 2);
		System.out.println(-8 >>> 2);

	}

}
