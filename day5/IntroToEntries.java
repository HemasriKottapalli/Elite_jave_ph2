package com.day5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IntroToEntries {

	public static void main(String[] args) {

	    HashMap<String,String> hm  = new HashMap();
        hm.put("Daisy","Pranathi");
        hm.put("Suma","Sumbalam");
        hm.put("Hemu","Hema");
        
        Set s = hm.keySet();
        System.out.println(s);
        
        Collection c = hm.values();
        System.out.println(c);
        
        Set s1 = hm.entrySet();
        System.out.println(s1);
        
        Iterator i = s1.iterator();
        while(i.hasNext())
        {
        	Object o = i.next();
        	Map.Entry e =(Map.Entry)o;
        	//Entry is inner interface inside the Map interface which
        	//has functions like getKey() and getValue()
        	System.out.println(e.getValue());
        	System.out.println(e.getKey());
        }
        
	}

}
