
/*
Take a List of Strings
Given 2 strings: 

Input :a, e

Output: Print 4


Input :c, e

Output: Print 2
*/


package com.thread.programs;

import java.util.ArrayList;
import java.util.List;

public class DistanceBetweenWords {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	static List<String> aList = new ArrayList();
	public static void main(String args[]){
		
		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("d");
		aList.add("e");
		
		System.out.println(calculateDistance("c","e"));
		
	}
	
	static int calculateDistance(String x, String y){
		int d1 = aList.indexOf(x);
		int d2 = aList.indexOf(y);
		if(d2 > d1){
			return d2-d1;
		} else {
			return d1-d2;
		}
	}

}
