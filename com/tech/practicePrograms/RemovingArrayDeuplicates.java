package com.tech.practicePrograms;
import java.util.Set;
import java.util.TreeSet;


public class RemovingArrayDeuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Use SET to remove duplicates
		
		String[] array = {"a","b","c","d","af","e","af"};
		Set<String> aSet = new TreeSet<String>();
		
		for(String str: array){
			if(!aSet.add(str)){
				System.out.println("Duplicate element is:"+ str);
			}
		}

	}

}
