/*
This function tells if 2 given Strings are ANAGRAMS.

If 2 strings have all similar characters, irrespective of the order , they are known to be Anagrams
*/

package com.thread.programs;

public class Anagram {
	public static void main(String args[]) {
		
		System.out.println(isAnagram("abcde","debca"));
	}
	
	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}
		char[] chars = word.toCharArray();
		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	}

	}
