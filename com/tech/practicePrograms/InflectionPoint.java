/**
 * Given an array of numbers find the inflection point (index) where the part of the array to the left & to the right of the inflection point (index) have EQUAL sum. If there is no inflection point, you can return -1. What is the time complexity & space complexity of your algorithm ? Is this the optimal solution?

Example-1: A = [1, 2, 3, 4, 5, 5, 2, 4, 4].

Inflection point = 4, as  A[0]+A[1]+A[2]+A[3] +A[4] = A[5]+A[6]+A[7]+A[8] = 15

Example-2: A = [-4, 3, 2, 14].

Inflection point = -1, there is no left subarray whose sum is equal to right subarray
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InflectionPoint {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(", "); // Reading input from STDIN
		int[] a = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			a[i] = Integer.parseInt(str[i]);
		}
		findInflectionPoint(a);
	}

	private static int findInflectionPoint(int[] a) {
		int sum=0, revSum=0;
		for(int i=0,j=a.length-1; i<=j;i++,j--){
			sum+=a[i];
			if(i!=j)
				revSum+=a[j];
				
			if(sum==revSum){
				System.out.println("Index is i :"+i);
				return i;
			}
			
		}
		System.out.println("Index not found, i :"+ -1);
		return 0;
	}
}
