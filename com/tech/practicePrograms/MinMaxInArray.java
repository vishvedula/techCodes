package com.tech.practicePrograms;
import java.util.Arrays;


public class MinMaxInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = {1,23,2535,-1,3434,345, 23432,24352,45, -22};
		Arrays.sort(array);
		
		System.out.println("Min value : " + array[0]);
		System.out.println("Max value: " + array[array.length-1]);
		
	}
}
