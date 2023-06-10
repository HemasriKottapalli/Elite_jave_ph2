package com.day4;

import java.util.EnumSet;
import java.util.concurrent.ConcurrentSkipListSet;

enum Days{
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
}

public class IntroToEnumSet {

	public static void main(String[] args) {
		EnumSet<Days> s = EnumSet.of(Days.MONDAY,Days.TUESDAY,Days.WEDNESDAY);
		System.out.println(s);
		EnumSet<Days> s1 = EnumSet.allOf(Days.class);
		System.out.println(s1);
		EnumSet<Days> s2 = EnumSet.noneOf(Days.class);
		System.out.println(s2);
		
		ConcurrentSkipListSet cs = new ConcurrentSkipListSet();
		cs.add(1);
		cs.add(100);
		cs.add(2);
		cs.add(6);
		cs.add(-4);
		System.out.println(cs); /items will be sorted
	}

}
