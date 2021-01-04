/*
This problem was asked by Airbnb.

Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.

Follow-up: Can you do this in O(N) time and constant space?

Solution  :
 We should make sure we dont use additional space, hence we are leveraging the existing array and keep editing the element to fetch the MAX value
 
 
*/

import java.lang.*;
public class FetchMaxValue {

    public static void main(String args[]) {
        System.out.println(largesNonAdjacentNumbersSumb(new int[] { 2, 4, 6, 2, 5 }));  // 13
        //System.out.println(largesNonAdjacentNumbersSumb(new int[] { 5, 1, 1, 5 }));  // 10
        //System.out.println(largesNonAdjacentNumbersSumb(new int[] { 5, 1, -1, -1, 5 }));  // 10
    }

    public static int largesNonAdjacentNumbersSumb(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;
        if (arr.length == 1)
            return arr[0];
        if (arr.length == 2)
            return Math.max(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            if (i > 2)
                arr[i] = Math.max(arr[i - 2], arr[i - 3]) + Math.max(0, arr[i]);
            else
                arr[i] = arr[i - 2] + Math.max(0, arr[i]);
        }

        return Math.max(arr[arr.length - 1], arr[arr.length - 2]);
    }

}
