/*
Minimum Number of Platforms Required for a Railway/Bus Station

    Difficulty Level : Medium
    Last Updated : 26 Nov, 2020

Given arrival and departure times of all trains that reach a 
railway station, the task is to find the minimum number of
platforms 
required for the railway station so that no train waits.

Approach : Have considered a 2D array

We could also get 2 diff 1D array for arrival and departure.

*/

import java.util.*;

public class FindMinPlatforms {
   public static void main(String[] args) {
      
      int[][] a = {
                   {900, 920},
                   {910,950},
                   {960,1000},
                   {850, 915}
                 };
      
      System.out.println("No.of platforms needed are :" + findMinPlatforms(a));
      
   }
   
   static int findMinPlatforms(int[][] a){
      int count=1;
      
      // To sort a multidimensional array using Comparator object
       java.util.Arrays.sort(a, new java.util.Comparator<int[]>() {
         public int compare(int[] a, int[] b) {
            return Integer.compare(a[0], b[0]);
    }
});
      
      for(int i=0,j=0;i<a.length-1;i++){
         if(a[i+1][j] < a[i][j+1]){
            count++;
         }
         
      }
      
      return count;
   }
}
