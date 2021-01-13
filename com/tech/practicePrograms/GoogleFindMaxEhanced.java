/*
For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, 
we should get: [10, 7, 8, 8], since:
    10 = max(10, 5, 2)
    7 = max(5, 2, 7)
    8 = max(2, 7, 8)
    8 = max(7, 8, 7)
    
    Do this in O(n) time and O(k) space.
    You can modify the input array in-place and 
    you do not need to store the results. 
    You can simply print them out as you compute them.
*/

import java.lang.Math;

public class GoogleFindMaxEnhanced {
   public static void main(String[] args) {
      int[] a = {10, 5, 2, 7, 8, 7, 5 ,9 ,20};
      int k=6;
      
      findMax(a,k);
   }
   
   static void findMax(int[] a, int k){
      // first find noOfSubsets we need to iterate
      int noOfSubsets = a.length - k + 1; // 9-3 = 6
      int x = k;
      int m = 0;
      while(noOfSubsets !=0){
         int currentMax = 0, finalMax =0;
         k=0;
         // logic goes here
         for(int i=m, j=i+1;k<x-1;i++,j++){
            currentMax = Math.max(a[i],a[j]);
            if(currentMax > finalMax)
               finalMax = currentMax;
            k++;
         }
         noOfSubsets--;
         m++;
         System.out.println("Max is: "+finalMax);
        
      }
   }
}
