package com.java.oops.arrays;

public class ArrayCloning {

	public static void main(String[] args) {

		int nums[] = { 34, 23, 243, 423, 342, 434, 3, 43 };
		int [] nums2 = nums;

//		manual
		int[] nums3 = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			nums3[i] = nums[i];
		}

//		using clone fn
		int[] nums4 = nums.clone();//use in 1D array only
		
		nums[0] = -1;
		System.out.println(nums3[0]);
		System.out.println(nums4[0]);

	}

}
