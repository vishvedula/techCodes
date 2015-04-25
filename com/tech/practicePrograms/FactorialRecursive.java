package com.tech.practicePrograms;
import java.util.Scanner;


public class FactorialRecursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		int number = new Scanner(System.in).nextInt();
		
		System.out.println("Recursive result is " + factRecursvie(number));
		
		
	}

	private static int factRecursvie(int number) {
		if(number == 1) {
			return 1;
		} else {
			return number * factRecursvie((number-1));
		}
	}
	

}
