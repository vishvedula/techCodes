/*
Input  : arr[] = [3, 4, 3, 5, 2, 3, 4, 3, 1, 5], index = 5
Output : 4
Element initial index – 5 (third 3)
After sorting array by stable sorting algorithm, we get 
array as shown below
[1(8), 2(4), 3(0), 3(2), 3(5), 3(7), 4(1), 4(6), 5(3), 5(9)]
with their initial indices shown in parentheses next to them,
Element's index after sorting = 4 
*/

package com.thread.programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Comparator;

public class FindingNewIndexPostSort {
	public static void main(String args[]) {

		int[] arr = { 3, 4, 3, 5, 2, 3, 4, 3, 1, 5 };
		int givenIndex = 5;

		System.out.println(arr[givenIndex]);

		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			hashMap.put(i, arr[i]);
		}

		System.out.println(hashMap);

		Collection<Integer> values = hashMap.values();

		// 1. Creating an ArrayList of values to check the sorted Array

		ArrayList<Integer> listOfValues = new ArrayList<Integer>(values);
		Collections.sort(listOfValues);
		System.out.println(listOfValues);

		// 2. To sort the Map directly instead of getting list again
		
		 Set<Entry<Integer, Integer>> set = hashMap.entrySet();
	        List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(set);
	        Collections.sort( list, new Comparator<Map.Entry<Integer, Integer>>()
	        {
	            public int compare( Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2 )
	            {
	                return (o1.getValue()).compareTo( o2.getValue() );
	            }
	        } );
	        int counter =0;
			for (Map.Entry<Integer, Integer> entry : list) {
				
				// System.out.println(entry.getValue()+" ==== "+entry.getKey());
				if (entry.getKey() == 5) {
					System.out.println("new index is: " + counter);
					break;
				}
				counter++;
			}
	}

}
