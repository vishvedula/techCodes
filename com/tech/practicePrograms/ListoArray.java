package com.tech.practicePrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> aList = new ArrayList<String>();
		aList.add("1");
		aList.add("2");
		aList.add("3");
		aList.add("4");
		aList.add("5");
		aList.add("6");
		System.out.println(""+aList);
		System.out.println(""+aList.toString());
		
		int[] array =  {1,2,3,4,45,5,5,6,6,6};
		Arrays.sort(array);
		
		for(int i=0; i< array.length; i++){
			System.out.println(+array[i]);
		}
		
	}

}
