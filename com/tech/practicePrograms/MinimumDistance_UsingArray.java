/*
 * We define the distance between two array values as the number of indices between the two values. 
 * Given , find the minimum distance between any pair of equal elements in the array. If no such value exists, print

.

For example, if
, there are two matching pairs of values: . The indices of the 's are and , so their distance is . The indices of the 's are and , so their distance is

.

Function Description

Complete the minimumDistances function in the editor below. It should return the minimum distance between any two matching elements.

minimumDistances has the following parameter(s):

    a: an array of integers

Input Format

The first line contains an integer
, the size of array .
The second line contains space-separated integers

.

Constraints

Output Format

Print a single integer denoting the minimum
in . If no such value exists, print

.

Sample Input

6
7 1 3 4 1 7

Sample Output

3

 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

	public class MinimumDistance {

	    // Complete the minimumDistances function below.
	    static int minimumDistances(int[] a) {
	    	
	    	
	    	/**
	    	 * Regular java array convention logic
	    	 */
	    	List<Integer> list = new ArrayList<>();
	    	for(int i=0;i<a.length-1;i++){
	    		for(int j=i+1; j<a.length;j++){
	    			if(a[i]==a[j]){
	    				int difference = j-i;
	    				list.add(difference);
	    			}
	    		}
	    	}
	    	if(list.isEmpty()){
	    		return 1;
	    	}
	    	Collections.sort(list);
	    	
	    	System.out.println(list.get(0));
	    	
	    	return (int)list.get(0);

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {

	        int n = scanner.nextInt();
	        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] a = new int[n];

	       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int aItem = scanner.nextInt();
	            a[i] = aItem;
	        }

	        int result = minimumDistances(a);


	        scanner.close();
	    }
	}
