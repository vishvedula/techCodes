
/*
 * Java logic to check the number of Iterations needed to equalize the ARRAY
 * Array Before Sort
 * [9,24,16,108]
 * 
 * Array After Sort
 * [130,130,130,130]
 * 
 * Iterations needed : 3
 */
 
package com.thread.programs;

import java.util.Arrays;

public class EqualizeDistribution {
	
	public static void main(String args[]){
		
		//int[] array = {4,8,6,19};
		
		int[] array = {9,24,16,108};
		
		equalize(array);
	}
	
	@SuppressWarnings("unused")
	static void equalize(int[] array) {

		Arrays.sort(array); // First step is to SORT this array
		int arrayLength = array.length; 
		int noOfIterations = 0;
		for (int i = 0; i < arrayLength-1; i++) {
			int difference = array[arrayLength - 1] - array[i]; // The DIFFERENCE to be added
			for (int j = 0; j < arrayLength - 1; j++) {
				array[j] = array[j] + difference;
			}
			noOfIterations++;
			Arrays.sort(array); // Always sort the array once the computation is DONE
			//break;
		}
		
		System.out.println("Number of iterations to make the numbers equal is :"+ noOfIterations);
		
		for (int i = 0; i < arrayLength; i++) {
		System.out.println(array[i]);
		}
		
	}

}
