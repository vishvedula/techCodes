/*
This problem was asked by Google.

Given an array of integers, return a new array where each element in the new array is the number of smaller 
elements to the right of that element in the original input array.

For example, given the array [3, 4, 9, 6, 1], return [1, 1, 2, 1, 0], since:

    There is 1 smaller element to the right of 3
    There is 1 smaller element to the right of 4
    There are 2 smaller elements to the right of 9
    There is 1 smaller element to the right of 6
    There are no smaller elements to the right of 1

*/
import java.util.Arrays;
public class GoogleSmallElements{

     public static void main(String []args){
       int[] arr = {3,4,9,6,1};
       
       findSmallElements(arr);
     }
     
     static int[] findSmallElements(int[] arr){
         
         // a loop with 2 pointers O(N^2)
         
         for(int i=0;i<arr.length; i++){
             int count=0;
             for(int j=i+1;j<arr.length;j++){
                 if(arr[j]<arr[i]){
                     count +=1;
                 }
             }
              arr[i] = count;
         }
         
         for(int k=0;k<arr.length;k++){
             System.out.print(" "+arr[k]);
         }
        // System.out.println(Arrays.asList(arr));
         return arr;
         
     }
     
     
}
