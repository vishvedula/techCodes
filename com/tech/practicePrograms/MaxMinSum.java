
/**
You will be given a list of integers array and a single integer k . You must create an array of length k from elements
of such that its unfairness is minimized. Call that array subarray. Unfairness of an array is calculated as

Sample Input 0

n = 7
k = 3
[10,100,300,200,1000,20,30]

Sample Output 0

20

Explanation :

max(10,20,30) - min(10,20,30) = 30 - 10 = 20

*/
import java.util.*;
public class MaxMinSum {
    public static void main(String args[]){
        int a[] = {1,4,7 ,2, 9, 3, 6, 10}; //--> [1,2,3,4,6,7,9,10] -->[1,2,3,4] , [2,3,4,6], [3,4,6,7], 
                                          //[4,6,7,9], [6,7,9,10]
        int k=4;
        printMinMaxSum(a, k);
    }

    static int printMinMaxSum(int arr[], int k){
        int sum = Integer.MAX_VALUE;
        int temp = 0;
        //int fa[] = new int[k];
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1;){ //[1,2,4,7] , k=2
            int[] fa = new int[k];
            for(int j=0;j<k && i<=arr.length-1;j++){
                fa[j]=arr[i++];
            }
            if(fa[k-1] >= fa[0]){
            temp=fa[k-1] - fa[0];
                if(temp <  sum) {
                    sum = temp; 
                 }
            }
            if(i!=arr.length){
                i = Math.abs(k-i)+1;
            }
        }

        System.out.print("Sum is :"+ sum);
        return sum;
    }

}
