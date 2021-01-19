/*
This problem was asked by Snapchat.
Given an array of time intervals (start, end) 
for classroom lectures (possibly overlapping), find the
minimum number of rooms required.
For example, given [(30, 75), (0, 50), (60, 150)],
you should return 2.
*/

import java.util.*;
public class FindClassroom {
   public static void main(String[] args) {
      
      int[][] a = {
                   {30,75},
                   {0,50},
                   {60,150},
                   {200,250}
                  };
      
      // First we need to sort this array based on startIntervals
      // using Comparator , Anonymous interface
      
      java.util.Arrays.sort(a, new java.util.Comparator<int[]>() {
         public int compare(int[] a, int[] b) { // sorting on columns
            return Integer.compare(a[0], b[0]);
    }
   });
      
      // After sorting
      
               /*{
                 {0,50},
                 {30,75},
                 {60,150},
                 {200,250}
                 };  */
      
    findMinClassrooms(a);
      
   }
   
   private static int findMinClassrooms(int[][]a){
      int count =0;
      System.out.println("Array length: "+ a.length);
      for(int i=0,j=0;i<a.length-1;i++){
         
            if(a[i][j+1] > a[i+1][j]){
               count++;
           
         }
      }
      System.out.println("Count of classrooms needed is :"+ count);
      return count;
   }
}
