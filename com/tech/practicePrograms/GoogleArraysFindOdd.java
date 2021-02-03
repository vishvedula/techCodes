
/*

HARD level :) !!!!!
Given an array of integers where every integer occurs three times except for one integer,
which only occurs once, find and return the non-duplicated integer.

For example, given [6, 1, 3, 3, 3, 6, 6], return 1. Given [13, 19, 13, 13], return 19.

Do this in O(N) time and O(1) space.

O(N)--> since looped through the array only once
O(1)--> haven't used any additional Collection or space

*/

import java .io.*; 
  
public class GoogleArraysFindOdd { 
   
    // Driver program to test printPowerSet 
    public static void main (String[] args) 
    { 
       int[] n = {6, 1, 1, 2, 3, 2, 6};
       
      System.out.print("the odd one is :"+findOddOne(n,0));
    } 
      
    static int findOddOne(int[] n, int i) 
    {  
        int count=0;
        int oddOne = 0;
        int tempValue=0;
       for(int j=n.length-1;i<n.length && j>=0;j--){
          
          if(n[i]==n[j]){
             count++;
             tempValue = n[j];
             oddOne=tempValue;
             n[j]=0;
          }
          
          if(i==j){
           
              if(count==1){
                  break;
                } else{
                 count=0;
                 ++i;
                 j=n.length;
                 continue;
              }
              
          } 
         
       }
        
      return oddOne;
  } 
      
   
} 
