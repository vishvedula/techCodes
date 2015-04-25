package com.tech.practicePrograms;
public class StringReverseRecursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str= "Hi this is Reversing a String";
		String reverseStr = recursiveReverse(str);
		System.out.println("Reverse is " + reverseStr);
		System.out.println("String length" + str.length());
	

}
 
	private static String recursiveReverse(String str) {
		if(str.length() < 2){
			return str;
		}
		
		return recursiveReverse(str.substring(1)) + str.charAt(0);
	}
}