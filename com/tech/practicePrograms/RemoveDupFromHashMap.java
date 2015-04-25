package com.tech.practicePrograms;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class RemoveDupFromHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		//List<String> aList = new ArrayList<>();
		treeMap.put(1, "a");
		treeMap.put(2, "b");
		treeMap.put(3, "c");
		treeMap.put(4, "d");
		treeMap.put(5, "e");
		treeMap.put(6, "e");
		treeMap.put(7, "k");
		treeMap.put(8, "f");
		treeMap.put(9, "d");
		treeMap.put(10, "c");
		treeMap.put(11, "j");
		treeMap.put(12, "b");
		treeMap.put(13, "a");
		treeMap.put(14, "i");
		
		//Set<String> set = new HashSet<String>();
		Iterator itr = treeMap.entrySet().iterator();
		Set<String> mySet = new HashSet<String>();
		
		while(itr.hasNext()){
			 Map.Entry<Integer, String> entrySet = (Map.Entry) itr.next();

		        String value = entrySet.getValue();

		        if (!mySet.add(value))
		        {
		            itr.remove();
		        }
		}
		System.out.println("" + treeMap);

	}

}
