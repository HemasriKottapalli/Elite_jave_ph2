package com.day4;

import java.util.LinkedList;
import java.util.TreeSet;

public class ExampleOfUse {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(108);
		l.add(108);
		l.add(167);
		l.add(18);
		l.add(17);
		l.add(156);
       System.out.println(l);
       //to remove duplicates and sort values we use treeset
       TreeSet ts= new TreeSet(l);
       System.out.println(ts);
	}

}
