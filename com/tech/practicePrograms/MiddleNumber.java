/**
Given an unsorted array of size N. Find the first element in array such that all of its left elements are smaller and all right elements to it are greater than it.

Note: Left and right side elements can be equal to required element. And extreme elements cannot be required element.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. First line of each test case contains an Integer N denoting size of array and the second line contains N space separated array elements.

Output:
For each test case, in a new line print the required element. If no such element present in array then print -1.*/


import java.util.*;
public class FindMiddleNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> aList = new ArrayList(){{
			add(4);
			add(2);
			add(7);
			add(6);
			add(10);
		
		}};
		
		printMiddleNumber(aList);
	}

	private static void printMiddleNumber(List<Integer> list){
		int listSize = list.size();
		boolean isMiddle = false;
		for(int i=1; i < listSize-1 ; i++ ){
			if(list.get(i-1) < list.get(i) && list.get(i+1) > list.get(i)) {
				isMiddle = true;
				System.out.println("Middle element is:"+ list.get(i));
				break;
			}
	}
		
		if(isMiddle){
			
		} else {
			System.out.println(-1);
		}
	}
}
