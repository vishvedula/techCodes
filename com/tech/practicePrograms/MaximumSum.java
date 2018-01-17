/**
 * 
Maximum sum such that no two elements are adjacent
3.3

Given an array of positive numbers, 
find the maximum sum of a subsequence with the constraint that no 2 numbers 
in the sequence should be adjacent in the array. So 3 2 7 10 should return 13 
(sum of 3 and 10) or 3 2 5 10 7 
should return 15 (sum of 3, 5 and 7).Answer the question in most efficient way.
 * @author vivedula
 *
 */
public class MaximumSum {

    /*Function to return max sum such that no two elements
    are adjacent */
  int FindMaxSum(int arr[], int n)
  {
      int incl = arr[0];
      int excl = 0;
      int excl_new;
      int i;

      for (i = 1; i < n; i++)
      {
          /* current max excluding i */
          excl_new = (incl > excl) ? incl : excl;

          /* current max including i */
          incl = excl + arr[i];
          excl = excl_new;
      }

      /* return max of incl and excl */
      return ((incl > excl) ? incl : excl);
  }

  // Driver program to test above functions
  public static void main(String[] args)
  {
      MaximumSum sum = new MaximumSum();
      int arr[] = new int[]{5, 5, 10, 100, 10, 5};
      System.out.println(sum.FindMaxSum(arr, arr.length));
  }
}