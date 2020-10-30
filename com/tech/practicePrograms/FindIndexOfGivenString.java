/**
 * 
Given a sorted array of strings which is interspersed with empty strings, write a method
to find the location of a given string.
Example: find “ball” in [“at”, “”, “”, “”, “ball”, “”, “”, “car”, “”, “”, “dad”, “”, “”] will return 4
Example: find “ballcar” in [“at”, “”, “”, “”, “”, “ball”, “car”, “”, “”, “dad”, “”, “”] will return -1
 */
package com.thread.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindIndexOfGivenString {
	@SuppressWarnings("unused")
	public static void main(String args[]) throws IOException{
		String[] stringArray = new String[]{"at","","","","ball","","","car","","","dad","",""};
		System.out.println("Find the index of the given value");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String value = br.readLine();
		System.out.println(isPresent(value, stringArray));
		
	}
	
	static int isPresent(String value, String[] stringArray){
		int index =0;
		boolean isPresent =false;
		for(int i=0; i<stringArray.length; i++){
			if(stringArray[i].equals(value)){
				index = i;
				isPresent = true;
				break;
			} 
		}
		if(isPresent){
			return index;
		} else{
			return -1;
		}
	}

}
