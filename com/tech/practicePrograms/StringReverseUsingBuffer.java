package com.tech.practicePrograms;

public class StringReverseUsingBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer string = new StringBuffer();
		String string1 = string.append("DID").toString();
		
		String reverse = string.reverse().toString();
		if(reverse.equalsIgnoreCase(string1)){
			System.out.println("Strings are equal");
			
		} else {
			System.out.println("NOT");
		}
		
	}

}
