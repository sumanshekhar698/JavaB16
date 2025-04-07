package com.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetExample {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(23);
		nums.add(23123);
		nums.add(-23);
		nums.add(2332);
		nums.add(-23);
		nums.add(23);
		
		HashSet<Integer> set = new HashSet<Integer>();//Hashing
//		Order is not maintained
//		No Duplicates Allowed
//		No index based access
//		Searching is very fast
		
		for (Integer num : nums) {
			set.add(num);
		}
		
		System.out.println(set);
		System.out.println(set.contains(23));
		
		Set<Integer> set2 = nums.stream().collect(Collectors.toSet());
		System.out.println(set2);
		
	}

}
