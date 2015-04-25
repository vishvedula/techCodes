package com.tech.practicePrograms;
import java.util.ArrayList;
import java.util.List;


 class AddDigits {
	 
public static void main (String args[]) {
	
	String str = "vivek12345rathi12341is #$%#$%#a good12345boy";
	int sum = 0;
	
	List<Character> array = new ArrayList<Character>();
	
	
	for(int i = 0 ; i < str.length() ; ++i){
		if(Character.isDigit(str.charAt(i)))
		  array.add((char) str.charAt(i));
		}
	
	
    for(int i = 0; i < array.size(); i++)
    {
        sum = sum + Integer.valueOf(array.get(i).toString());
    }
   
    System.out.println(""+sum);
}

}
