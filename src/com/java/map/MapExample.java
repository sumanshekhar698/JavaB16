package com.java.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {// Nashorn /Rhino compiler

//		K:V

//		rolNo:name

		HashMap<Integer, String> map = new HashMap<Integer, String>();// Hashing on Keys
//		Keys cannot be duplicate
//		Values can be duplicate
//		Searching is very fast Keys
//		Key based access
//		Order is not maintained

		map.put(3, "Saniya");// 3: "Saniya" Entry
		map.put(5, "Bill");

		map.put(8, "Tom");
		map.put(5, "Mary");
		map.put(86, "Soniya");

		System.out.println(map);

		System.out.println(map.get(4));
		System.out.println(map.get(3));

		System.out.println(map.containsKey(3));

		Set<Entry<Integer, String>> set = map.entrySet();
		for (Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
