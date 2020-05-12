/**
Lexicographical order is often known as alphabetical order when dealing with strings. A string is greater than another string if it comes later in a lexicographically sorted list.

Given a word, create a new word by swapping some or all of its characters. This new word must meet two criteria:

    It must be greater than the original word
    It must be the smallest word that meets the first condition

Sample Input 0

5
ab
bb
hefg
dhck
dkhc

Sample Output 0

ba
no answer
hegf
dhkc
hcdk

Explanation 0

    Test case 1:
    ba is the only string which can be made by rearranging ab. It is greater.
    Test case 2:
    It is not possible to rearrange bb and get a greater string.
    Test case 3:
    hegf is the next string greater than hefg.
    Test case 4:
    dhkc is the next string greater than dhck.
    Test case 5:
    hcdk is the next string greater than dkhc.

Sample Input 1

6
lmno
dcba
dcbb
abdc
abcd
fedcbabcd

Sample Output 1

lmon
no answer
no answer
acbd
abdc
fedcbabdc


*/

import java.util.Arrays;
import java.util.Scanner;

public class BiggerIsGreater {

	/**
	 * method to find the next lexicographical greater string
	 * 
	 * @param w
	 * @return a new string
	 */
	static String biggerIsGreater(String w) {
		char charArray[] = w.toCharArray();
		int n = charArray.length;
		int endIndex = 0;

		// step-1) Start from the right most character and find the first character
		// that is smaller than previous character.
		for (endIndex = n - 1; endIndex > 0; endIndex--) {
			if (charArray[endIndex] > charArray[endIndex - 1]) {
				break;
			}
		}

		// If no such char found, then all characters are in descending order
		// means there cannot be a greater string with same set of characters
		if (endIndex == 0) {
			return "no answer";
		} else {
			int firstSmallChar = charArray[endIndex - 1], nextSmallChar = endIndex;

			// step-2) Find the smallest character on right side of (endIndex - 1)'th
			// character that is greater than charArray[endIndex - 1]
			for (int startIndex = endIndex + 1; startIndex < n; startIndex++) {
				if (charArray[startIndex] > firstSmallChar && charArray[startIndex] < charArray[nextSmallChar]) {
					nextSmallChar = startIndex;
				}
			}

			// step-3) Swap the above found next smallest character with charArray[endIndex - 1]
			swap(charArray, endIndex - 1, nextSmallChar);

			// step-4) Sort the charArray after (endIndex - 1)in ascending order
			Arrays.sort(charArray, endIndex , n);

		}
		return new String(charArray);
	}

	/**
	 * method to swap ith character with jth character inside charArray
	 * 
	 * @param charArray
	 * @param i
	 * @param j
	 */
	static void swap(char charArray[], int i, int j) {
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			String in = sc.next();
			System.out.println(biggerIsGreater(in));
		}
	}
}
