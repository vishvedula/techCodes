/**
 * 	
[Closest Palindrome ]

Given a number N. our task is to find the closest Palindrome number whose absolute difference with given number is minimum.

Input:
The first line of the input contains integer T denoting the number of test cases. Each test case contains a  number N.

Output:
For each test case, the print the closest palindrome number.
Note:  If the difference of two closest palindromes numbers is equal then we print smaller number as output.

Constraints:
1<=T<=1000
1<=n<=10^14

Input :
2
9
489

output:
8
484

Explanation :

Test Case 1: closest palindrome number is 8.
 * @author vivedula
 *
 */
public class ClosestPalindrome {

	/**
	 * @param args
	 */
	// Have 2 pointers i,j traversing in opposite directions, and replacing j values with i's with quality checks
	public static void main(String[] args) {

		int number = 1890;
		String str = String.valueOf(number);
		char[] a = str.toCharArray();
		int arrayL = a.length;
		
		for(int i=0; i<arrayL; i++){
			for(int j= arrayL-1; j>i; j--){
				if(a[i] != a[j]){
					a[j]=a[i];
				}
				i++;
			}
			break;
		}

		for(int k=0; k<arrayL; k++){
			System.out.print(a[k]);
		}

	}

}
