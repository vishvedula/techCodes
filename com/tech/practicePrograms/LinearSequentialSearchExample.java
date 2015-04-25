package com.tech.practicePrograms;

public class LinearSequentialSearchExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9,0};
		int key = -1;
		System.out.println("Key searched :" + findKey(array, key));

	}
	
	private static boolean findKey( int[] array, int key) {
		boolean isSearched = false;
		for(int i=0; i<array.length; i++){
			if(key == array[i]) {
				isSearched = true;
				break;
			} else isSearched = false;
		}
		return isSearched;
	}
}
