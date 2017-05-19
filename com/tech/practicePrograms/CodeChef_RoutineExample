/**
 * Java code to check the Chef's daily routine 
 * Correct scenario order would be : C-->E-->S
 * 
 * Anything diverting from the same would be an issue
 * Input:
 *  8
	CES
	CS
	SC
	ECCC
	CEEE
	CECS
	CESC
	ECCC
	
	Output:
	yes
	yes
	no
	no
	yes
	no
	no
	no

 */
package CodeChef;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChefDailyRoutine {
	private static boolean flag = false;

	public static void main(String args[]) {
		//System.out.println("Enter the number of testcases");
		Scanner scan = new Scanner(System.in);
		int noOfTestCases = scan.nextInt();
		String[] strArray = new String[noOfTestCases];
		for (int j = 0; j < noOfTestCases; j++) {
			strArray[j] = scan.next();
		}
		// Using HashMap to set the order of the 3 character 'C', 'E', 'S'
		// as
		// 0, 1, 2
		Map<Character, Integer> aMap = new HashMap<Character, Integer>();
		aMap.put('C', 0);
		aMap.put('E', 1);
		aMap.put('S', 2);

		for (int k = 0; k < strArray.length; k++) {
			int prevOrder = 0;
			char[] charArray = strArray[k].toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				int order = aMap.get(charArray[i]);
				if (order >= prevOrder) {
					prevOrder = order;
					flag = true;
				} else {
					flag = false;
					break;
				}

			}
			if (flag) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}

	}
}
