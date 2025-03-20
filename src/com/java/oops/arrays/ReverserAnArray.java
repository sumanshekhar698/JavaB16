package com.java.oops.arrays;

import java.util.Arrays;

public class ReverserAnArray {

	public static void main(String[] args) {

		int[] nums = { 3, 3, 4, 455, 65, 5, 65, 56, 3, 23, -1 };
		System.out.println(Arrays.toString(nums));

		int i = 0, j = nums.length - 1;

		while (i < j) {

			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			
			i++;
			j--;

		}

		System.out.println(Arrays.toString(nums));

	}

}
