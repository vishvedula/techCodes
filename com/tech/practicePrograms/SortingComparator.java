package com.tech.practicePrograms;
import java.util.Arrays;
import java.util.Comparator;


public class SortingComparator {
	public static void main(String[] args) {
		
		String myArray[] = {"d","f","e","a","b"};
		Arrays.sort(myArray, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
		
		for(String a: myArray) {
			System.out.println(""+a);
		}
	}

}
