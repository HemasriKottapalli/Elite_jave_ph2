package com.day5;

import java.util.HashMap;

public class IntroToMap {

	public static void main(String[] args) {
		// Doesn't implement collections interface
		//it uses hash table data structure
		/*          
		        #Map___________ 
		         |            |--*HashTable             Note:
		        #SortedMap    |--*LinkedHashMap             #----Interface
		          |           |--*HashMap                   *----class
		        *TreeSet
		 */
		       HashMap<String,String> hm  = new HashMap();
               hm.put("Daisy","Pranathi");
               hm.put("Suma","Sumbalam");
               hm.put("Hemu","Hema");
               System.out.println(hm);
               //using putAll
               HashMap<String,String> hm1  = new HashMap();
               hm1.putAll(hm);
               System.out.println(hm);
               System.out.println(hm1.get("Daisy"));
               hm1.remove("Daisy");
               System.out.println(hm.containsKey("Suma"));
               System.out.println(hm.containsValue("Sumbalam"));
               System.out.println(hm.equals(hm1));
               hm1.clear();
               System.out.println(hm1);
               // we can also use methods: replace
	}

}
