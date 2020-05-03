/**
 * You will be given an array of integers and a target value. 
 * Determine the number of pairs of array elements that have a difference equal to a target value.

For example, given an array of [1, 2, 3, 4] and a target value of 1, 
we have three values meeting the condition:
2-1, 3-2, 4-3
 */

import java.util.*;
public class FindNumberOfPairs {

    public static void main(String args[]){
        int[] arr = {1 ,5, 3, 4, 2 } ;
        int n = 5; 
        int k = 2;
        findNumberOfPairs(arr, n, k);
    }

    static int findNumberOfPairs (int[] arr,int n, int k){
        int result = 0;
        Arrays.sort(arr); // 1 ,2 ,3 ,4 , 5 --> diff = 2
        for(int i=0;i<arr.length; i++){
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i]-arr[j]) == k){
                    result++;
                    break;
                } 
            }
            
        }
        System.out.print(result);
        return result;
    }
    
}
