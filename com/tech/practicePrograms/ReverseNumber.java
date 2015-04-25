package com.tech.practicePrograms;
import java.util.Scanner;


public class ReverseNumber {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		 Scanner scanner=new Scanner(System.in); 
		 int rnum=0; 
		 
		 System.out.println("Enter the number:"); 
		 int num=scanner.nextInt(); 
		 int rem=0;
		 // 123
		 while(num >0) { //123 >0
		      rem = num%10; // 123%10 = 3
		      num = num/10; // 123 /10 = 12 
		      rnum = rnum*10 + rem; // 30
		 }
		 
		 
		  System.out.println("Reverse is :"+rnum);  
		} 
		 
		} 

