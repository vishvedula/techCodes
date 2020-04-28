
/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two space-separated long integers.

For example arr[1,3,5,7,9]
. Our minimum sum is 16 [1,3,5,7] and our maximum sum is 24 [3,5,7,9]. We would print 

16 24
*/

import java.lang.*;
import java.math.*;
import java.util.*;
public class MinMaxSum {

     public static void main(String []args){
        int[] a = {1,2,3,4,5}; 
        findMinMaxSum(a);
     }
     
    static void findMinMaxSum(int[] a){
        BigInteger minResult = BigInteger.ZERO;
        BigInteger maxResult = BigInteger.ZERO;
        BigInteger sum = BigInteger.ZERO;
        Arrays.sort(a); 
        
        for(int i=0;i<a.length;i++){
            sum = sum.add(BigInteger.valueOf(a[i]));
        }
        
        
            minResult = sum.subtract(BigInteger.valueOf(a[a.length-1]));
            maxResult = sum.subtract(BigInteger.valueOf(a[0]));
       
        System.out.println("Sum is "+sum);
        System.out.println("minResult is "+minResult);
        System.out.println("maxResult is "+maxResult);
        
        System.out.print(minResult +" "+ maxResult );
    }
}
