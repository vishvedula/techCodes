package com.tech.practicePrograms;
import java.util.Scanner;

public class Fibonacci_Practice {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Fibonacci : 0 1 1 2 3 5 8 .....

		System.out
				.println("Enter the number to generate the fibonacci series: ");
		int scan = new Scanner(System.in).nextInt();
		for (int i = 0; i < scan; i++) {
			System.out.println(" " + fibo(i));
		}
	}

	private static int fibo(int number) {

		if(number ==0 ) {
			return 0;
		}
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibo(number - 1) + fibo(number - 2);

	}
}
