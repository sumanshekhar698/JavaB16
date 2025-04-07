package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainCustomSorting {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Jim", 30));
		list.add(new Student("Jill", 23));
		list.add(new Student("Mory", 57));

		list.add(new Student("Mary", 26));
		list.add(new Student("Monty", 97));

		Collections.sort(list);
		list.stream().forEach(System.out::println);

		System.out.println();
		ArrayList<StudentOriginal> list2 = new ArrayList<StudentOriginal>();
		list2.add(new StudentOriginal("Jim", 30));
		list2.add(new StudentOriginal("Jill", 23));
		list2.add(new StudentOriginal("Mory", 57));

		list2.add(new StudentOriginal("Mary", 26));
		list2.add(new StudentOriginal("Monty", 97));
		

//		Collections.sort(list2,new RolNoSorter());
		
		Collections.sort(list2,(st1 ,st2)->{
			return st1.name.compareTo(st2.name);
		});
		
		
		list2.stream().forEach(System.out::println);

	}

}

class  NameSorter implements Comparator<StudentOriginal>{

	@Override
	public int compare(StudentOriginal st1, StudentOriginal st2) {
		// TODO Auto-generated method stub
		return st1.name.compareTo(st2.name);
	}
	
}

class  RolNoSorter implements Comparator<StudentOriginal>{

	@Override
	public int compare(StudentOriginal st1, StudentOriginal st2) {
		if (st1.rollNo == st2.rollNo)
			return 0;

		else if (st1.rollNo > st2.rollNo)
			return 1;
		else
			return -1;
	}
	
}
