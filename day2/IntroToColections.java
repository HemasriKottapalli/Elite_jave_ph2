package com.day2;
//all methods in collections are static so no need to create object before using
import java.util.*;
public class IntroToColections {

	public static void main(String[] args) {
		/*
		 * Wrapper classes are used to convert primitive to non primitive(objects) and vice versa
		 * collections only accept Integer not int 
		 * Boxing: convert primitive to object
		 * Unboxing : convert object to primitive
		 * 
		 * int    Integer
		 * float  Float
		 * double Double
		 * byte   Byte
		 * short  Short
		 * char   Character
		 * long   Long
		 * boolean Boolean
		 *
		*/
		List<Integer> l = new ArrayList();
		l.add(1);
		l.add(9);
		l.add(3);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		//iteration method 1
		for(int i=0; i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		//iteration method 2
		for(int i:l)
		{
			System.out.println(i);
		}
		//iteration method 3
		Iterator i =l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		l.set(0, 999);//set()
		System.out.println(l);
		System.out.println(l.isEmpty());//isEmpty()
		l.remove(0);//remove()
		System.out.println(l);
		
	}
   
}
/* a class that extends an abstract class is called a CONCRETE class */