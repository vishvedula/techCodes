/*
This problem was asked by Google.
Given a list of integers S and a target number k, write a function that returns a subset of S that adds
up to k. If such a subset cannot be made, then return null.
Integers can appear more than once in the list. You may assume all numbers in the list are positive.
For example, given S = [12, 1, 61, 5, 9, 2] and k = 24, return [12, 9, 2, 1] since it sums up to 24

Let's consider the brute force method: selecting all subsets, summing them, and checking if they
equal k. That would take O(2^N * N) time, since generating all subsets takes O(2^N) and we need to
sum everything in the subset.
*/

import java .io.*; 
  
public class GoogleFindSubsetsAndSum { 
   
    public static void main (String[] args) 
    { 
       int[] set = {1,4,7,10}; 
        System.out.println("Count of subsets summing to the given number are :"+
                           printPowerSet(set,set.length, 10)); 
    } 
   
      
    static int printPowerSet(int []set, 
                            int setSize, int number) 
    { 
       int sum =0;
       int count=0;
        
        long powSetSize = (long)Math.pow(2, setSize); 
        int i, j; 
      
        
        for(i = 0; i < powSetSize; i++) 
        { 
            sum = 0;
            for(j = 0; j < setSize; j++) 
            {  
              if((i & (1 << j)) > 0) {
                  System.out.print(set[j]+",");
                  sum+=set[j];
               }
               
            }
           if(sum==number){
              count++;
           }
              
            System.out.println(); 
        } 
       return count;
    } 
      
    
} 
