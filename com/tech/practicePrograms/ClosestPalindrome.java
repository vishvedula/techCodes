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
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		List<char[]> list = new ArrayList<>();
		BigDecimal number;
		for(int l=0; l<testCase; l++){
			number = scan.nextBigDecimal();
			// if already palindrome, then increment and send the number else send as it is
			
			if(isPalindrome(number.intValueExact())&& integerDigits(number)>1){
				number = number.add(new BigDecimal(1));
			}
			String str = String.valueOf(number);
			char[] a = str.toCharArray();
				
			int arrayL = a.length;
			for (int i = 0; i < arrayL; i++) {
				if(arrayL ==1){
					a[i] = (char) (a[i]-1);
					break;
				}
				for (int j = arrayL - 1; j > i; j--) {
					if (a[i] != a[j]) {
						a[j] = a[i];
					}
					i++;
				}
				break;
			}
			list.add(a);
		}
		for(int z=0; z<list.size(); z++){
			System.out.println(list.get(z));
		}
	}
	
	// to check if length of number is 1
	private static int integerDigits(BigDecimal number) {
		number = number.stripTrailingZeros();
	    return number.precision() - number.scale();
	}

	// To check if already palindrome, ex 999, then result should be 1001
	public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }
}

