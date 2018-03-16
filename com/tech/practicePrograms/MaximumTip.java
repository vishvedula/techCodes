import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 	
Maximum Tip Calculator

Rahul and Ankit are the only two waiters in Royal Restaurant. 
Today, the restaurant received N orders. 
The amount of tips may differ when handled by different waiters, 
if Rahul takes the ith order, he would be tipped Ai rupees and if Ankit takes this order, the tip would be Bi rupees.

*****In order to maximize the total tip value they decided to distribute the order among themselves.****

One order will be handled by one person only. 
Also, due to time constraints Rahul cannot take more than X orders and Ankit cannot take more than Y orders.
 It is guaranteed that X + Y is greater than or equal to N, 
 which means that all the orders can be handled by either Rahul or Ankit. 
 Find out the maximum possible amount of total tip money after processing all the orders.


Input:

•    The first line contains one integer, number of test cases.
•    The second line contains three integers N, X, Y.
•    The third line contains N integers. The ith integer represents Ai.
•    The fourth line contains N integers. The ith integer represents Bi.

Output:
Print a single integer representing the maximum tip money they would receive.
 

Constraints:
1 ≤ N ≤ 105
1 ≤ X, Y ≤ N; X + Y ≥ N
1 ≤ Ai, Bi ≤ 104

Example:

Input:

2
5 3 3
1 2 3 4 5
5 4 3 2 1
8 4 4
1 4 3 2 7 5 9 6 
1 2 3 6 5 4 9 8

Output:

21
43

 * @author vivedula
 *
 */
public class MaximumTip {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "resource"})
	public static void main(String[] args) {
		int x = 4, y = 4;
		int n = 8;
		Integer[] a = new Integer[n];
		Integer[] b = new Integer[n];
		Scanner scan = new Scanner(System.in);

		// fill a[]
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		Scanner scan1 = new Scanner(System.in);

		// fill b[]
		for (int j = 0; j < n; j++) {
			b[j] = scan1.nextInt();
		}

		int tip = 0;
		for (int i = 0; i < n; i++) {
			tip += a[i];
			b[i] -= a[i];
		}
		Arrays.sort(b, Collections.reverseOrder());
		for (int i = 0; (n - i) > x || (i < y && b[i] >= 0); i++) {
			tip += b[i];
		}
		System.out.println(tip);
	}
}
