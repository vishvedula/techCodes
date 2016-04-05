/* Problem statement

Given a list of integers with no duplicates, find out how many swaps it will take to sort the list in increasing order using Bubble sort.
Input

First line of each test case will contain an integer T = number of test cases. Each test case will contain two lines. First line will contain a number N = no. of elements in the list. Next line will contain N space separated numbers. 1 <= N <= 50.
Output

For each test case, print on a single line, number of swaps required to sort the list in increasing order using Bubble sort.
Sample Input

3
5
2 1 4 6 3
10 
123 21 34 45 25 675 23 44 55 900
1
23

Sample Output

3
16
0
*/

import java.util.Scanner;

public class BubbleSort {

	@SuppressWarnings("resource")
	public static void main(String args[]) {

		int i, j, swap;
		Scanner parentScan = new Scanner(System.in);
		System.out.println("Number of testcases to be run is/are: ");
		int noOfTestcases = parentScan.nextInt();
		System.out.println(noOfTestcases);
		for (int x = 0; x < noOfTestcases; x++) {
			int counter = 0;
		System.out.println("Input number of integers to sort: ");
		Scanner scan = new Scanner(System.in);
		int limit = scan.nextInt();

			int[] array = new int[limit];
			for (i = 0; i < limit; i++) {
				array[i] = scan.nextInt();
			}

			for (i = 0; i < (limit - 1); i++) {
				for (j = 0; j < limit - i - 1; j++) {
					if (array[j] > array[j
							+ 1]) /* For descending order use < */
					{
						swap = array[j];
						array[j] = array[j + 1];
						array[j + 1] = swap;
						counter++;
					}
				}
			}
			System.out.println("the number of swaps are:" + counter);
			// System.out.println(counter);

			System.out.println("Sorted list of numbers");
			for (i = 0; i < limit; i++)
				System.out.println(array[i]);
		}
	}

}
