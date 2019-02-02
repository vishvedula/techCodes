/**
 * Sample Input

2
12
1012

Sample Output

2
3

Explanation

The number 12
is broken into two digits, 1 and 2. When is divided by either of those two digits, the remainder is 0

so they are both divisors.

The number 1012
is broken into four digits  1, 0, 1, and 2. is evenly divisible by its digits 1, 1, and 2, but it is not divisible by 0 as division by zero is undefined.
 */
import java.io.IOException;
import java.util.Scanner;


	public class FindDigits {
		private static final Scanner scanner = new Scanner(System.in);
	    
		// Complete the findDigits function below.
	    static int findDigits(int n) {
	    	String str = String.valueOf(n);
	    	int[] arr = new int[str.length()];
	    	for (int i = 0; i < str.length(); i++)
	    	{
	    	    arr[i] = str.charAt(i) - '0';
	    	}
	    	int count =0;
	    	for(int i=0;i<arr.length;i++){
	    		if(arr[i]!=0 && n%arr[i]==0){
	    			count++;
	    		}
	    	}
	    	System.out.println(count);
	    	return count;
	    }

	    

	    public static void main(String[] args) throws IOException {
	        int t = scanner.nextInt();
	        for (int tItr = 0; tItr < t; tItr++) {
	            int n = scanner.nextInt();
	            int result = findDigits(n);
	        }
	        scanner.close();
	    }
	}
