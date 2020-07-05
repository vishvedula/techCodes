/**
Given n
and k , print the lexicographically smallest absolute permutation P

. If no absolute permutation exists, print -1.

For example, let n=4
giving us an array  post = [1,2,3,4]. If we use 1 based indexing, create a permutation where every array |pos[i]-i| = k. If k=2 , we could rearrange them to

[3,4,1,2]

:

pos[i]	i	|Difference|
3	1	2
4	2	2
1	3	2
2	4	2

Function Description

Complete the absolutePermutation function in the editor below. It should return an integer that represents the smallest lexicographically smallest permutation, or

if there is none.

absolutePermutation has the following parameter(s):

    n: the upper bound of natural numbers to consider, inclusive
    k: the integer difference between each element and its index


Sample Input

3
2 1
3 0
3 2

Sample Output

2 1
1 2 3
-1

*/

package tech_related;

import java.io.*;
import java.util.*;

/**
 *
 * @author vivedula
 */
public class AbsolutePermutations {


    // Complete the absolutePermutation function below.
    static int[] absolutePermutation(int n, int k) {
        int a[] = new int[n];
        int value=0;
         for(int m=0;m<n;m++){
             a[m] = ++value;
         }
         //int[] a = {1,2};
          if(k==0){
              for(int l=0;l<a.length;l++){
                  System.out.print(a[l]);
                 
              }
               return a;
              
         }

         if(k==1){
              int temp1;
              //Swap the adjacent elements
              for(int b=0;b<n;b++){
                    temp1 = a[b];
                    a[b]=a[b+1];
                    a[b+1]= temp1;
                    b++;
              }
              System.out.println("Array: " + Arrays.toString(a)); 
              return a;
          }
          
         int temp;
         int noOfSwaps=0;
         List<Integer> arr = new ArrayList<Integer>();
         for(int i=0;i<n;i++){

           for(int j=a.length-1;j>0;j--){
               if(noOfSwaps != a.length){
                if(Math.abs(a[i]-a[j])==k){

                    if(!arr.contains(a[i]) && !arr.contains(a[j]) ){
                        temp = a[i];
                        a[i]=a[j];
                        a[j]= temp;
                        noOfSwaps = noOfSwaps+2;
                    
                        arr.add(a[i]);
                        arr.add(a[j]);
                     }
                    break;
                }   
           }
        }   
         }
         if(noOfSwaps == a.length && noOfSwaps==arr.size()){
             System.out.print(Arrays.toString(a));
             return a;
         } else{
             a = new int[1];
             a[0] = -1;
             System.out.print(a[0]);
            return a;
            }
        //return a; 
     }
    
    


    public static void main(String[] args) throws IOException {
             int n =10;
             int k=0;

            int[] result = absolutePermutation(n, k);

    }
  }

