package com.day5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class IntroLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("ChennaiExpress","19:00");
		lhm.put("Tatkal","20:00");
		lhm.put("Daisumbalam","20:00");
        System.out.println(lhm);
        
        Set s = lhm.entrySet();
        System.out.println(s);
        
        Iterator i =s.iterator();
        while(i.hasNext())
        {
        	Map.Entry e = (Map.Entry)i.next();
        	if(e.getValue().equals("20:00")) {
        		e.setValue("18:00");
        	}
        }
        
        System.out.println(lhm);
	}

}
