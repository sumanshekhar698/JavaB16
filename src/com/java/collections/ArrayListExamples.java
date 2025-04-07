package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.java.oops.Car;

public class ArrayListExamples {

	public static void main(String[] args) {
		int[] arr = { 3, 34, 34, 33 };

		// Collections only store Objects, they don't store primitive variables
		ArrayList list = new ArrayList();
//		Dynamic in Nature
//		Order is maintained
//		Duplicates Allowed
//		Indexed

		list.add("hey");
		list.add(23);
		list.add(new Car());

		System.out.println(list);

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(23);
		nums.add(23123);
		nums.add(-23);
		nums.add(2332);
		nums.add(-23);

		System.out.println(nums);

		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " ");
//			nums.add(4);
		}

		System.out.println();

		for (Integer num : nums) {
			System.out.print(num + " ");
//			nums.add(4);
		}

		System.out.println();

		Iterator<Integer> itr = nums.iterator();

		while (itr.hasNext()) {
			Integer num = (Integer) itr.next();
			System.out.print(num + " ");

		}
		System.out.println();

//		Streams
		nums.stream().filter(num -> num % 2 == 0).forEach(System.out::println);// :: Method ref operator

		System.out.println(nums.isEmpty());

//		List<Integer> newNums = List.of(-23, 23);
//		System.out.println(nums.containsAll(newNums));

		Collections.shuffle(nums);
		System.out.println(nums);

		Collections.sort(nums);// ASC
		System.out.println(nums);

		Collections.sort(nums, Collections.reverseOrder());// DSC
		System.out.println(nums);

	}

}
