import java.util.Scanner;

/**
Sample Input

5 4
1 2 3 4 5

Sample Output

5 1 2 3 4

Explanation

When we perform left rotations, the array undergoes the following sequence of changes:

Thus, we print the array's final state as a single line of space-separated values, which is 5 1 2 3 4.

20 10
Input:
41 73 89 7 10 1 59 58 84 77 77 97 58 1 86 58 26 10 86 51

Output:
77 97 58 1 86 58 26 10 86 51 41 73 89 7 10 1 59 58 84 77

 * @author vivedula
 *
 */
public class RotateArray {
	 public static int[] arrayLeftRotation(int[] a, int n, int k) {
		 int[] resultArray = new int[n];
		 int result = 0;
		 for(int i=0; i< n; i++){
			 if(k+i > n-1){
				 resultArray[i]  = a[k+i-n];
			 } else {
				 resultArray[i] = a[k+i];
			 }
		 }
		 
		 return resultArray;
	      
	    }
	    
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int a[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	      
	        int[] output = new int[n];
	        output = arrayLeftRotation(a, n, k);
	        for(int i = 0; i < n; i++)
	            System.out.print(output[i] + " ");
	      
	        System.out.println();
	      
	    }
	}



   