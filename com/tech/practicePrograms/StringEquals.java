package com.tech.practicePrograms;

public class StringEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "Hello"; // a new object
		String s2  = 'h'+"ello"; // a new object
		
		String s3 = s1 ; // reference to same object
		
		System.out.println("Are they equal :" + (s1==s2));
		System.out.println("Are these equal" + s1.equals(s2));
		
		System.out.println("Are they equal :" + (s1==s3));
		System.out.println("Are these equal" + s1.equals(s3));
		

	}

}
