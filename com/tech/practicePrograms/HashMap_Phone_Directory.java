package com.tech.practicePrograms;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Java_Phone_Directory_Search_HashMap {
	
	public static void main(String args[]) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		 int noOfArguments=sc.nextInt();
		 sc.nextLine();
		Map<String, Integer> hashMap = new LinkedHashMap<String,Integer>();
		
		for (int i = 0; i <noOfArguments; i++) 
		{

			// To take the String name
			String name = sc.nextLine();

			// To take the phoneNumber
			int number = sc.nextInt();

			hashMap.put(name, number);
			 sc.nextLine();
		}
		
		 while(sc.hasNext())
	       {
	           String query =sc.nextLine().trim();
	           //Using Ternary operator
	           System.out.println(hashMap.containsKey(query) ? query+"="+hashMap.get(query) : "Not found");
	       }
		
	}

}
