package com.tech.practicePrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class RemoveDuplicates {

	public static void main (String args[]) {
	
	//ArrayList with duplicates String
	List<String> duplicateList = (List<String>) Arrays.asList("Android" , "Android", "iOS", "Windows mobile");
	System.out.println("size of Arraylist with duplicates: " + duplicateList.size()); //should print 4 becaues of duplicates Android

	System.out.println(duplicateList);
	      
	//Converting ArrayList to HashSet to remove duplicates
	HashSet<String> listToSet = new HashSet<String>(duplicateList);
	      
	//Creating Arraylist without duplicate values
	List<String> listWithoutDuplicates = new ArrayList<String>(listToSet);
	System.out.println("size of ArrayList without duplicates: " + listToSet.size()); //should print 3 becaues of duplicates Android removed

	System.out.println(listWithoutDuplicates);
	}
}
