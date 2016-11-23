package com.thread.programs;

import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class ReverseVowelsFromString {
	public static void main (String args[]){
		List<Character> vowelList = new ArrayList<Character>();
		vowelList.add('a');
		vowelList.add('e');
		vowelList.add('i');
		vowelList.add('o');
		vowelList.add('u');
		List<Character> newList = new ArrayList<Character>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the String");
			String input = br.readLine();
			char[] characterArray =  input.toCharArray();
			for(int i=0; i<characterArray.length;i++){
				for(Character vowel: vowelList){
					if(vowel.equals(characterArray[i])){
						newList.add(vowel);
					}
				}
			}
			System.out.println(newList);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		
}

