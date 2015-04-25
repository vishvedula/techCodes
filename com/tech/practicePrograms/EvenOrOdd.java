package com.tech.practicePrograms;
import java.util.Scanner;


public class EvenOrOdd {
	    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	        int limit = scan.nextInt();
	        int a[] = new int[limit]; // creates array of limit value
	        for (int i = 0; i < limit; i++) {
	            a[i] = scan.nextInt();
	        }
	        for (int i = 0; i < limit; i++) {
	            calculateEvenorOdd(a[i]);
	        }
	    }

	    private static boolean calculateEvenorOdd(int n) {

	        if (n % 2 == 0) {
	            System.out.println("EVEN");
	            return true;
	        } else {
	            System.out.println("ODD");
	            return false;

	        }

	    }
	}
