/*
Good morning! Here's your coding interview problem for today.

This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
*/

import java.io.*; 
import java.util.*;
import java.lang.*;
  
public class PrintSubsets { 
  
   public static void main (String args[]){
      int[] a = {1, 2, 3, 4, 5};
     
      prepareArray(a);
      
   }
   
   static int[] prepareArray(int[] a){
      
      int[] fArray = new int[a.length];
      int count=0;
      int n = a.length;
      
      for(int i=0;i<n;i++){
      
         fArray[count] = 1; // Initialize that array for every outer  loop
         
         for(int j=0;j<n;j++){
            if(i==j){
               // Do nothing
            }else{
               fArray[count] = fArray[count] * a[j];
            }
          
         }
         
         count++;
         
       }
      System.out.println(Arrays.toString(fArray));
      return fArray;
   }
} 
