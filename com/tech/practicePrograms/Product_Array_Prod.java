/**
 * Given an array arr[] of n integers, construct a Product Array prod[] (of same size) such that prod[i] is equal to the product of all the elements of arr[] except arr[i].

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N,N is the size of array.
The second line of each test case contains N input A[i].

Output:

Print the Product array prod[].

Constraints:

1 ≤ T ≤ 10
1 ≤ N ≤ 15
1 ≤ C[i] ≤ 20

Example:

Input
2
5
10 3 5 6 2
2
12 20

Output
180 600 360 300 900
20 12
 * @author vivedula
 *
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(){{
			add(10);
			add(2);
			add(3);
			add(5);
			add(8);
		}};
		
		int size = list.size();
		for(int i=0; i< size; i++) {
			List<Integer> list2 = new ArrayList<>(list); // creates a shallow Copy of first list
			int product = 1;
			list2.remove(i);
			Iterator itr = list2.iterator();
			while (itr.hasNext()) {
				product = product * (Integer) itr.next();

			}
			System.out.println(product);
		}
		
	}

}
