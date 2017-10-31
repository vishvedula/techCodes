/**
 * The maximum sum subarray problem consists in finding the
 *  maximum sum of a contiguous subsequence in an array or list of integers:

Java program to print largest contiguous array sum
		 
Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
// should be 6: {4, -1, 2, 1}

Easy case is when the list is made up 
of only positive numbers and the maximum sum is the sum of the 
whole array. If the list is made up of only negative numbers, return 0 instead.

Empty list is considered to have zero greatest sum. 
Note that the empty list or array is also a valid sublist/subarray.

 * @author vivedula
 *
 */

	public class MaxSubarraySum
	{
	    public static void main (String[] args)
	    {
	        //int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
	        int [] a = {-2, 8, 0, 89};
	        System.out.println("Maximum contiguous sum is " +
	                                       maxSubArraySum(a));
	    }
	 
	    static int maxSubArraySum(int a[])
	    {
	        int size = a.length;
	        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
	 
	        for (int i = 0; i < size; i++)
	        {
	            max_ending_here = max_ending_here + a[i];
	            if (max_so_far < max_ending_here)
	                max_so_far = max_ending_here;
	            if (max_ending_here < 0)
	                max_ending_here = 0;
	        }
	        return max_so_far;
	    }
	}