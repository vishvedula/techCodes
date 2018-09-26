/**
 * Imagine you have a special keyboard with the following keys: 
Key 1:  Prints 'A' on screen
Key 2: (Ctrl-A): Select screen
Key 3: (Ctrl-C): Copy selection to buffer
Key 4: (Ctrl-V): Print buffer on screen appending it
                 after what has already been printed. 

If you can only press the keyboard for N times (with the above four keys), 
write a program to produce maximum numbers of A's. That is to say, the input parameter is N (No. of keys that you can press), 
the output is M (No. of As that you can produce).

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N,N is the number of key.

Output:

Print maximum number of A's.  Print -1, if N is greater than 75.

Constraints:

1 ≤ T ≤ 50
1 ≤ N ≤ 75

Example:

Input:
2
3
7

Output:
3
9

Explanation:

Input:  N = 3
Output: 3
We can at most get 3 A's on screen by pressing 
following key sequence.
A, A, A

Input:  N = 7
Output: 9

We can at most get 9 A's on screen by pressing 
following key sequence.
A, A, A, Ctrl A, Ctrl C, Ctrl V, Ctrl V

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MySpecialKeyboard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printSpecialKeyboard(n);
	}
	
	private static int printSpecialKeyboard(int n)
	{
		int max=Integer.MIN_VALUE;
		
		List<Character> charList = new ArrayList<Character>();
		List<String> stringList = new ArrayList<String>();
		charList.add('A');
		charList.add('A');
		charList.add('A');
		
		stringList.add("ca");
		stringList.add("cc");
		stringList.add("cv");
		
		if(n<=6){
			System.out.println(n);
			return n;
		} else {
			int diff = n - 6; // 9-6 = 3
			for (int k = diff; k > 0; k--) {
				for (int i = 0; i < k; i++) {
					charList.add('A');
				}
				if(k<diff){
					stringList.add("cv");
				}
				int cvCount = 0;
				for (int j = 0; j < stringList.size(); j++) {
					if (stringList.get(j).equals("cv")) {
						cvCount++;
					}

				}
				//Logic to maintain max value, hint: use INTEGER.MIN_VALUE
				if(max < (charList.size() + charList.size() * cvCount)){
					max = charList.size() + charList.size() * cvCount;
				}
				
				for (int i = k; i> 0; i--) {
					charList.remove(i);
				}
			}
		}
		System.out.println(max);
		return max;
	}

}
