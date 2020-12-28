/*
Good morning! Here's your coding interview problem for today.

This problem was recently asked by GOOGLE.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?

Solution I could think of :

This problem is to find if there exists any subset for given number .
- Should happen in 1 pass
- Used HashSet to addAll the numbers from array
- Leveraged the Input, to find if there exists any difference in array 
- Voila it worked !


*/

import java.io.*; 
import java.util.*;
import java.lang.*;
  
public class FindSubsetInOnePass { 
  
   public static void main (String args[]){
      Integer[] a = {10,15,3,7};
      int k = 19;
      System.out.println(findSubset(a,k));
      
   }
   
   static boolean findSubset(Integer[] a, int k){
      Set<Integer> set = new HashSet<Integer>();
      
      set.addAll(Arrays.asList(a));
      
      for(int x: a){
         int diff = Math.abs(k-x);
         if(set.contains(diff)){
            return true;
         }
      }
      
      System.out.println(set);
      
      return false;
      
   }
} 
