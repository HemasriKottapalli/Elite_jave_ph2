package com.day4;

import java.util.TreeSet;

public class setInterface {

	public static void main(String[] args) {
		/*
		             #Collections
		           /           \
		         abstract      #Set
		         collection     |
		          /            #SortedList
		 AbstractSet____              |
		  /      |      \            #Navigable
CopyOnWriteSet  EnumSet  \              /    \
		                 HashSet     TreeSet   ConcurrentSet
		                   |
		               LinkedHashSet
		
		=> Note: # indicates interface
		 */
        
		TreeSet t = new TreeSet();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		//t.add("dizzy"); throws an classCastException
		System.out.println(t);
	}

}
