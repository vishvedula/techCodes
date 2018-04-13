/**

Given an array A of size N, find all combination of four elements in the array whose sum is equal to a given value K. 
For example, if the given array is {10, 2, 3, 4, 5, 9, 7, 8} and K = 23, one of the quadruple is “3 5 7 8” (3 + 5 + 7 + 8 = 23).

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. 
Each test case contains two lines. The first line of input contains two integers N and K. Then in the next line are N space separated values of the array.

Output:
For each test case in a new line print all the quadruples present in the array separated by space which sums up to value of K. 
Each quadruple is unique which are separated by a delimeter "$" and are in increasing order.

Constraints:
1<=T<=100
1<=N<=100
-1000<=K<=1000
-100<=A[]<=100

Example:
Input:
2
5 3
0 0 2 1 1 
7 23
10 2 3 4 5 7 8
Output:
0 0 1 2 $
2 3 8 10 $2 4 7 10 $3 5 7 8 $
*/


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
class FindSumUsingDP
 {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    for(int i = 0; i < T; i++) {
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        int[] vals = new int[n];
	        for(int j = 0; j < n; j++) {
	            vals[j] = sc.nextInt();
	        }
	        System.out.println(findQuads(vals, k));
	    }
	    sc.close();
	}
	
	private static String findQuads(int[] a, int k) {
	    StringBuilder sb = new StringBuilder();
	    Set<String> st = new LinkedHashSet<>();
	    Arrays.sort(a);
	    for(int i = 0; i < a.length - 3; i++) {
	        for(int j = i+1; j < a.length-2; j++) {
	            int x = j+1, y = a.length-1;
	            while(x < y) {
	                int res = a[i] + a[j] + a[x] + a[y];
	                if (res == k) {
	                    String tmp = a[i]+ " " + a[j] + " "
	                    + a[x] + " " + a[y] + " $";
	                    st.add(tmp);
	                    x++;
	                    y--;
	                } else if(res < k) {
	                    x++;
	                } else {
	                    y--;
	                }
	            }
	        }
	    }
	    for(String us : st) {
	        sb.append(us);
	    }
	    return sb.length() > 0 ? sb.toString() : -1+"";
	}
}