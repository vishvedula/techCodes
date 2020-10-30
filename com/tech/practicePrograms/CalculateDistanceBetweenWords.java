/*

Design a class which receives a list of words in the constructor, and implements a method that takes two words word1 and word2 and return the shortest distance between these two words in the list.

For example,
Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

Given word1 = “coding”, word2 = “practice”, return 3.
Given word1 = "makes", word2 = "coding", return 1.

*/

package com.thread.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculateDistanceBetweenWords {
	static List<String> listOfStrings = new ArrayList<String>();
	static Map<Integer,String> hashMap = new HashMap<Integer, String>();
	public static void main(String args[]){
		
		listOfStrings.add("practice");
		listOfStrings.add("makes");
		listOfStrings.add("perfect");
		listOfStrings.add("coding");
		listOfStrings.add("makes");
		
		
		for(int i=1; i<=listOfStrings.size();i++){
			hashMap.put(i, listOfStrings.get(i-1));
		}
	
		System.out.println("distance is "+calculateDistance("makes", "coding"));
	}
	
	
	private static int calculateDistance(String st1, String st2){
		
		int d1 = 0, d2=0;

		for(Map.Entry<Integer, String> entry: hashMap.entrySet()){
			System.out.println("key("+entry.getKey() +")"+ ":value("+entry.getValue()+")");
			
			if(st1.equals(entry.getValue())){
				 d1 = entry.getKey();
			}
			
			if(st2.equals(entry.getValue())){
				 d2 = entry.getKey();
			}
			
		}
		
		System.out.println("\n"+"d1: "+d1+"& d2: "+d2 +"\n");
		if(d2>d1){
			return d2-d1;
		} else{
			return d1-d2;
		}
		
	}

}
