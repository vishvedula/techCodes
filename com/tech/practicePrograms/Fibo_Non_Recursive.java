package com.tech.practicePrograms;
import java.util.Scanner;


public class Fibo_Non_Recursive {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter the number till where fibo is needed");
		int number = new Scanner(System.in).nextInt();
		int fibo = 0, a=0, b=1, c=0;
		System.out.println(+a);
		System.out.println(""+b);
		for(int i=0; i<number-2;i++) {
			c = a+b;
			a=b;
			b=c;
			System.out.println(""+c);
		}
		
	}

}
