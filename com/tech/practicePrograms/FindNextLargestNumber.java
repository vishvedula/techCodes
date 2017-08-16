/**
 * Java code to find the next largest number.
 * If theres no largest number, print -1
 * 
 * I/P: [4, 1, 2, 3]
 * O/P: [-1, 2, 3, -1]
 * 
 * I/P: [1, 3, 2, 4]
 * O/P: [3, 4, 4, -1]
 * 
 * I/P: [6, 8, 7, 10]
 * O/P: [8, 10, 10, -1]
 * 
 * I/P: [6, 8, 1, 0]
 * O/P: [8, -1, -1, -1]
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindNextLargestNumber {

	public static void main(String args[]) {
		System.out.println("Enter the number of testcases");
		Scanner scan = new Scanner(System.in);
		int noOfTestcases = scan.nextInt();
		for (int l = 0; l < noOfTestcases; l++) {

			System.out.println("Enter the number of numbers");
			int sizeOfArray = scan.nextInt();
			int a[] = new int[sizeOfArray];
			for (int k = 0; k < sizeOfArray; k++) {
				a[k] = Integer.parseInt(scan.next());
			}
			int length = a.length;
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < length - 1; i++) {
				boolean flag = true;
				for (int j = i + 1; j < length; j++) {
					if (a[j] > a[i]) {
						list.add(a[j]);
						flag = false;
						break;
					}
				}
				if (flag) {
					list.add(-1);
				}
			}
			list.add(-1);
			System.out.println(list);
		}
	}
}