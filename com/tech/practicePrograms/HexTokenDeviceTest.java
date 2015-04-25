package com.tech.practicePrograms;
import java.util.regex.Pattern;


public class HexTokenDeviceTest {
	
	public static void main(String args[]){
		String hex = "LoadTest1393420310538";
		//Pattern p = Pattern.compile("[0-9a-fA-F]+");
		
		boolean check = hex.matches("[0-9a-fA-F]+");
		//int value = Integer.parseInt(hex, 16);  
		
		System.out.println(""+check );

	}

}
