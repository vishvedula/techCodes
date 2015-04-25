package com.tech.practicePrograms;
public class StringPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("IRI");
		String str1 = new StringBuilder(str).toString();

		String reverse = str.reverse().toString();
		if (reverse.equals(str1)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("NOT");
		}

	}

}
