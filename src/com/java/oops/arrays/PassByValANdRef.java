package com.java.oops.arrays;

import java.util.Arrays;

public class PassByValANdRef {

	public static void main(String[] args) {
		int x = 9;
		int[] nums = { 43, 34, 3434, 34, 32 };

		callMe(x, nums);

		System.out.println(x);// ?9
		System.out.println(nums[0]);// ?1000

	}

	static void callMe(int x, int[] nums2) {// x will receive a value of x

		x = 100;
		nums2[0] = 1000;

	}

}
