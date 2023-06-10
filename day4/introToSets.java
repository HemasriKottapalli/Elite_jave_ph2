package com.day4;

import java.util.Collections;
import java.util.HashSet;

public class introToSets {

	public static void main(String[] args) {
		/*
		          Set Interface
		           |   |
		           |   |__HashSet class
		           |   |
 SortedListInterface   |__LinkedHashSet class
		       |
		   TreeSet class
		   
		 */
		HashSet s = new HashSet(100);//HashSet(capacity,filling rate)
		s.add(1);//add
		Collections.addAll(s,4,2,3);//addAll
		System.out.println(s);
		s.add("java");
		System.out.println(s);
		s.remove("java");//remove
		System.out.println(s);
		System.out.println(s.size());//size
		for(Object x:s)//traversing through different data types.
		{
			System.out.println(x);
		}
		System.out.println(s.contains("java"));//contains
		System.out.println(s);
		HashSet s1 = new HashSet(100);
		s1.addAll(s); //addAll
		System.out.println(s1);
		s1.removeAll(s); //removeAll
		System.out.println(s1);
		Object[] arr = s.toArray();
		for(Object x:arr)
		{
			System.out.println(x);
		}
	}

}
// we can convert any collection into array using "toArray()" method
//but array only contains homogeneous elements so to store heterogeneous elements we should use Object array