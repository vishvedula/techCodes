package com.tech.practicePrograms;
import java.util.Scanner;


public class Fibonacci {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter the fibonacci series "+ "\n");
		int number = new Scanner(System.in).nextInt();
		System.out.println("Fibonacci to be filled till" + number);
		for(int i=1; i<=number; i++)
		System.out.println("Series is:" + fibo(i));
	}

	private static int fibo(int number) {
		
		if(number == 1 || number ==2) {
			return 1;
		}
		return fibo(number-1) + fibo(number-2);
		
	}
}
