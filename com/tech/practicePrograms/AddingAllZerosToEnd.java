/**
 * Adding all 0's to the end of the List
 */
package com.tech.practicePrograms;

import java.util.ArrayList;
import java.util.List;

public class ArraySortingAllZeros {

	public static void main(String args[]){
		
		// Using time complexity O(N) and Space complexity O(1)
		int[] array = { 1, 0, 0, 2, 1, 0, 0,45, 9, 5}; //1,2,1,45,9,5,0,0,0,0
		int index = 0;
		int n = array.length;
		for(int i=0; i<n;i++){
			if(array[i]!=0){
				array[index] = array[i];
				index++;
			}
		}

		while(index<n){
			array[index]=0;
			index++;
		}

		for(int i=0; i<n;i++){
			System.out.print(" "+array[i]);


	}
	}



	// Used List, which would consume Heap space.
	// We can do it using the array itself.
	/*public static void main(String args[]) {
		int[] array = { 1, 0, 0, 2, 1, 0, 0,45, 9, 5};

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}

		System.out.println(sortAllZeros(list));
	}

	static List<Integer> sortAllZeros(List<Integer> list) {
		List<Integer> tempList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 0) {
				tempList.add(list.get(i));
				list.remove(i);
				i--;
			}
		}
		// System.out.println(tempList);
		// System.out.println(list);
		list.addAll(tempList);
		return list;

	}*/

}
