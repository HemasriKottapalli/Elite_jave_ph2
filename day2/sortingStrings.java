package com.day2;
import java.util.*;
public class sortingStrings {

	public static void main(String[] args) {
		List list = new ArrayList();
		List lens = new ArrayList();
		Scanner inp= new Scanner(System.in);
		int n=inp.nextInt();
		//taking strings input
		String a;
		int l;
		for(int i=0; i<n; i++)
		{
			a=inp.next();
			l=a.length();
			lens.add(l);
			list.add(a);
		}
		 for(int i=0; i<n; i++)
		 {
			 int x= Collections.min(lens);
			 int y = lens.indexOf(x);
			 System.out.println(list.get(y));
			 lens.remove(y);
			 list.remove(y);
		 }
	}

}
