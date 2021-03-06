/*
 *  
 Limak has a string S. Each character of S is a digit '0' or '1'.

Help Limak and check if all the '1' digits form a single non-empty segment 
(consecutive subsequence) in the string. 
For each test case, print "YES" or "NO" accordingly.

Input:
6
001111110
00110011
000
1111
101010101
101111111111

Output:
YES
NO
NO
YES
NO
NO
 */
 
package CodeChef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BinaryCheck {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] charArray = str.toCharArray();
		Map<Integer, Character> aHashMap = new HashMap<Integer, Character>();
		for (int i = 0; i < charArray.length; i++) {
			aHashMap.put(i, charArray[i]);
		}
		checkBinary(aHashMap, charArray);
	}

	private static boolean checkBinary(Map<Integer, Character> aHashMap,
			char[] array) {
		List<Integer> list = new ArrayList<Integer>();

		for (int j = 0; j < array.length; j++) {
			if (aHashMap.get(j).equals('1')) {
				list.add(j);
			}
		}
		int intArray[] = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			intArray[i] = list.get(i);
		}
		boolean isYes = false;
		if (!list.isEmpty()) {
			if (list.size() > 1) {
				for (int k = 0; k < intArray.length - 1; k++) {
					if (intArray[k + 1] - intArray[k] > 1) {
						isYes = false;
						break;
					} else {
						isYes = true;
						continue;
					}
				}
			}
			else {
				isYes = true;
			}
		}else{
			isYes = false;
		}

		if (isYes) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		return false;
	}
}
