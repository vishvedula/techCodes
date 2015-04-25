package com.tech.practicePrograms;

public class Singleton {

	private static  Singleton singleton;
	
	private Singleton() 
	{
		
	}
	
	
	
public static void main(String[] args) {
	if(singleton == null) {
		singleton = new Singleton();
		System.out.println("Created");
	} else {
		System.out.println("Already exists");
	}
}

}
