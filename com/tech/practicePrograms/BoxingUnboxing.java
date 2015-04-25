package com.tech.practicePrograms;

public class BoxingUnboxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			String str= "1";
			System.out.println(""+Integer.parseInt(str));
			
			int a = Integer.parseInt(str); // Autoboxing
			System.out.println(""+a);
			
			Integer i = a;
			System.out.println(""+i); // Unboxing
			
			String str1= "1089098098";
			Long l = Long.valueOf(str1);
			System.out.println(""+l);
			
			
			String str3 = String.valueOf(l);
			System.out.println(""+str3);
	}

}
