/**
Sorting String Array, based on the Anagrams.

Sort in such a way that in the Output, Anagrams are together.

Input : { "abc", "def", "bca", "abb" }
Output: 
abb
abc
bca
def

Input: { "abc", "def", "bca", "aef" }
Output:
abc
bca
aef
def
**/

package com.thread.programs;

import java.util.Arrays;
import java.util.Comparator;

public class SortAnagrams {

	public static void main(String args[]) {
		String[] stringArray = { "abc", "def", "bca", "abb" };
		
		// Writing a Comparator to override the sorting logic
		Arrays.sort(stringArray, new AnagramComparator());
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
	}
}

class AnagramComparator implements Comparator<String> {
	public String sortChars(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	public int compare(String s1, String s2) {
		return sortChars(s1).compareTo(sortChars(s2));
	}
}
