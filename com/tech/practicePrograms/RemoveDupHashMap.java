package com.tech.practicePrograms;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


 class RemoveDupHashMap {

   // TreeMap defines the order but not removing the duplicates
	 public static void main (String args[]) {
		 Map<String, String> myMap = new TreeMap<String, String>();
		    myMap.put("1", "One");
		    myMap.put("2", "Two");
		    myMap.put("3", "One");
		    myMap.put("4", "Three");
		    myMap.put("5", "Two");
		    myMap.put("6", "Three");

		    Set<String> mySet = new HashSet<String>();

		    for (Iterator itr = myMap.entrySet().iterator(); itr.hasNext();)
		    {
		        Map.Entry<String, String> entrySet = (Map.Entry) itr.next();

		        String value = entrySet.getValue();

		        if (!mySet.add(value))
		        {
		            itr.remove();
		        }
		    }
		    System.out.println("mymap :" + myMap);
	 }


}