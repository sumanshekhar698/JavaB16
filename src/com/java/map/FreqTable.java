package com.java.map;

import java.util.ArrayList;
import java.util.HashMap;

public class FreqTable {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(23);
		nums.add(23123);
		nums.add(-23);
		nums.add(2332);
		nums.add(-23);
		nums.add(23);
		nums.add(-23);
		nums.add(23);
		nums.add(-23);
		nums.add(22313);
		nums.add(-23);
		nums.add(23);
		nums.add(-23123);
		nums.add(2123);

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for (Integer num : nums) {
//			if (map.containsKey(num)) {
//				map.put(num, map.get(num) + 1);
//			} else {
//				map.put(num, 1);
//
//			}
//		}
//		
		for (Integer num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}


		System.out.println(map);

	}

}
