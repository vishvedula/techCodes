/**

Maximum Product Subarray

Given an array that contains both positive and negative integers, 
find the product of the maximum product subarray. Expected Time complexity is O(n) and only O(1) extra space can be used.

Examples:

Input: arr[] = {6, -3, -10, 0, 2}
Output:   180  // The subarray is {6, -3, -10}

Input: arr[] = {-1, -3, -10, 0, 60}
Output:   60  // The subarray is {60}

Input: arr[] = {-2, -3, 0, -2, -40}
Output:   80  // The subarray is {-2, -40}
*/

public class MaxSubArrayProduct {
	public static void main(String[] args) {
		//int[] sArray = {-3,-10,0,2,4};
		int[] sArray = {-3,10,2,-4};
		System.out.println(findMaxProd(sArray));
	}
	
	private static int findMaxProd(int[] arr){
		 int n = arr.length;
	        int max_ending_here = 1;
	 
	        int min_ending_here = 1;
	 
	        int max_so_far = 1;

	        for (int i = 0; i < n; i++)
	        {
	            if (arr[i] > 0)
	            {
	                max_ending_here = max_ending_here*arr[i];
	                min_ending_here = min (min_ending_here * arr[i], 1);
	            }
	 
	            else if (arr[i] == 0)
	            {
	                max_ending_here = 1;
	                min_ending_here = 1;
	            }
	 
	            else
	            {
	                int temp = max_ending_here;
	                max_ending_here = max (min_ending_here * arr[i], 1);
	                min_ending_here = temp * arr[i];
	            }
	 
	            if (max_so_far <  max_ending_here)
	                max_so_far  =  max_ending_here;
	        }
	 
	        return max_so_far;
	    }
	
	static int min (int x, int y) {return x < y? x : y; }
	 
    static int max (int x, int y) {return x > y? x : y; }
    
    
}
