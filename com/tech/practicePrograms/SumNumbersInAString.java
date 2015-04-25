package com.tech.practicePrograms;

 class SumNumbersInAString {

	public static void main (String[] args) {
		String randomString = "vivek12345rathi1234is a good12345boy";
		int length = randomString.length();
		int sum = 0;
		for(int i=0; i<length; i++) {
			try {
				sum = sum + Integer.parseInt("" + randomString.charAt(i));
			} catch (NumberFormatException nfe) {
				//do nothing
			}
		}
		System.out.println("sum of digits is : " + sum);
	}
}
