package com.java.oops.arrays;

import java.util.Arrays;

public class ArraysIntro {

	public static void main(String[] args) {

//		Arrays are simplest data structures
//		Arrays are objects in Java
//		Arrays are homogeneous in nature
//		Arrays are fixed in size, they cannot grow or shrink

		int[] nums = new int[5];// [0,0,0,0,0]
		System.out.println(nums);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();

		Arrays.fill(nums, 1, 3, 5);// ending is exclusive

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();

		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();

		for (int num : nums) {// for each
			System.out.print(num + " ");

		}
		System.out.println();

		System.out.println(Arrays.toString(nums));

		int[] nums2 = { 3, 3, 4, 455, 65, 5, 65, 56, 3, 23, -1 };
		System.out.println(Arrays.toString(nums2));
		Arrays.sort(nums2);//ASC
		System.out.println(Arrays.toString(nums2));
		
		Arrays.sort(nums2);//ASC + reverse the array = DSC


		String[] words = new String[0];// size should be 0 and above

	}

}
