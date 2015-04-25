package com.tech.practicePrograms;
import java.util.ArrayList;
import java.util.List;


public class CharAtExample {
	public static void main (String args[]) {
		
		String str = "Hello World Java";
		int sum = 0;
		
		List<Character> array = new ArrayList<Character>();
		
		String[] words = str.split(" "); 
		
//		for(int i = 0 ; i < str.length() ; ++i){
//			
//			  array.add((char) str.charAt(i));
//			}
//		System.out.println("Done");
		
		
		for(int i=0;i<words.length;i++)
			System.out.println(words[2]); 
	}

}
