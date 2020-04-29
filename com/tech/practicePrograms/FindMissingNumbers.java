/**
Numeros the Artist had two lists that were permutations of one another. 
He was very proud. Unfortunately, while transporting them from one exhibition to another, 
some numbers were lost out of the first list. Can you find the missing numbers?

As an example, the array with some numbers missing,
. The original array of numbers . The numbers missing are . 

Input : 
arr[] = {203 ,204, 205, 206, 207, 208, 203, 204, 205, 206};
brr[] = {203 ,204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204, 301};

Output: 204, 205, 206, 301
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech_related;

import java.util.*;
import java.lang.*;

/**
 *
 * @author vivedula
 */
public class FindMissingNumbers {
    

     public static void main(String []args){
        int[] a = {203 ,204, 205, 206, 207, 208, 203, 204, 205, 206, 301}; 
        int[] b = {203 ,204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204, 301};
        findMissingNumbers(a,b);
     }
     
    static int[] findMissingNumbers(int[] arr, int[] brr){
       Arrays.sort(arr);
       Arrays.sort(brr);
       Map<Integer,Integer> map1 = new HashMap<Integer, Integer>();
       Map<Integer,Integer> map2 = new HashMap<Integer, Integer>();
       
       Set<Integer> set1 = new LinkedHashSet<Integer>();
        

       for(int i=0;i<arr.length;i++){
           if(!set1.add(arr[i])){
               int count1=Integer.valueOf(map1.get(arr[i]));
               map1.put(arr[i],++count1);
           } else {
                map1.put(arr[i], 1);
                set1.add(arr[i]);
           }
          }
       
       //set.clear();
       
       Set<Integer> set2 = new LinkedHashSet<Integer>();
        for(int i=0;i<brr.length;i++){
           if(!set2.add(brr[i])){
               int count=Integer.valueOf(map2.get(brr[i]));
               map2.put(brr[i], ++count);
               map2.get(i);
           } else {
                map2.put(brr[i], 1);
                set2.add(brr[i]);
           }
          }
       
        int diff = Math.abs(arr.length - brr.length);
        //String result = "";
        int[] result = new int[diff];
        int i=0;
        for(Integer s: set2){
               if(map1.get(s)!= null && map2.get(s)!=null){
                if(Math.abs(map1.get(s) - map2.get(s)) > 0){
                result[i] = s;
                i++;
                }
  
         } else {
                result[i] = s;
                i++;
            }
 }
       for(int k=0; k<result.length;k++){
           System.out.print(result[k]+ " ");
       }
              
       return result;
       
    }

}
