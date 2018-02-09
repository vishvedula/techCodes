/**
 * We define a modified Fibonacci sequence using the following definition:

    Given terms and where , term is computed using the following relation:

For example, if term and , term , term , term , and so on.

Given three integers, , , and , compute and print term of a modified Fibonacci sequence.

Note: The value of may far exceed the range of a -bit integer. 
Many submission languages have libraries that can handle such large results but, 
for those that don't (e.g., C++), you will need to be more creative in your solution to compensate for the limitations of your chosen submission language.

Input Format

A single line of three space-separated integers describing the respective values of , , and .

Constraints

    may far exceed the range of a -bit integer.

Output Format

Print a single integer denoting the value of 
term in the modified Fibonacci sequence where the first two terms are and .

Sample Input

0 1 5

Sample Output

5

Explanation

The first two terms of the sequence are and , which gives us a modified Fibonacci sequence of . 
Because , we print term , which is .
 */


import java.math.BigInteger;
import java.util.Scanner;


public class FibonacciModified {

	/**
	 * @param args
	 */
	 static BigInteger fibonacciModified(int t1, int t2, int n) {
	        BigInteger[] a = new BigInteger[n];
	        BigInteger result = null;
			a[0]=BigInteger.valueOf(t1);
			a[1]= BigInteger.valueOf(t2);
			BigInteger temp;
			for(int i=0; i<n-1; i++ ){
				temp = a[i+1];
				a[i+2] = temp.multiply(temp).add(a[i]);
				if(i+2 == n-1){
					 result = a[i+2];
					//System.out.println(result);
					break;
				}
			}
	        return result;
	    }
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int n = in.nextInt();
        BigInteger result = fibonacciModified(t1, t2, n);
        System.out.println(result);
        in.close();
    }
}
