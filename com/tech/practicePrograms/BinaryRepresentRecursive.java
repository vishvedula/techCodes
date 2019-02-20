/**
 * 
 * Given a positive integer N, print count of set bits in it. For example, if the given number is 6(binary: 110), output should be 2 as there are two set bits in it.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each testcase contains single line of input containing the N.

Output:
For each test case, in a new line, print count of set bits in it.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 106

Example:
Input:
2
6
11
Output:
2
3
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BinaryRepresentRecursive {
	  static int c =0;

	static void bin(int n) 
	{ 
	    
		/* step 1 */
	    if (n > 1) {
	    	 bin(n/2); 	
	    }
	  
	    /* step 2 */
    	System.out.print(n % 2);

	    if(n%2 == 1){
	    	++c;
	    }
	} 
	  
	//Driver code 
	public static void main(String[] args)  
	{ 
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		List list = new ArrayList<>();
		for(int i=0;i<testCases;i++){
			int n = scan.nextInt();
			bin(n);
			list.add(c);
			}
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		} 
	} 
