/**
==========Almost Sorted===========
Given an array of integers, determine whether the array can be sorted in ascending order using only one of the following operations one time.

    Swap two elements.
    Reverse one sub-segment.

Determine whether one, both or neither of the operations will complete the task. If both work, choose swap. For instance, given an array

 [2,3,5,4]either swap the 4 and 5 , or reverse them to sort the array. Choose swap. The Output Format section below details requirements. 

Sample Input 1

2  
4 2  

Sample Output 1

yes  
swap 1 2

Explanation 1

You can either swap(1, 2) or reverse(1, 2). You prefer swap.

----------------------------
Sample Input 2

3
3 1 2

Sample Output 2

no

Explanation 2

It is impossible to sort by one single operation.

-------------------------------
Sample Input 3

6
1 5 4 3 2 6

Sample Output 3

yes
reverse 2 5

Explanation 3

You can reverse the sub-array d[2...5] = "5 4 3 2", then the array becomes sorted. 
-------------------------------
*/

package tech_related;


import java.util.*;
public class FindNoOfOperations{

     public static void main(String []args){
        int arr[] = {1 ,5 ,4 ,3 ,2 ,6};
       //int[] arr={1,3,4,7,5,6};
       //int arr[] = {3,1,2};
       //int arr[] = {2,3,5,4};
       //int arr[] = {4,2};
        findNoOfOperations(arr);
     }
     
     static void findNoOfOperations(int[] arr){
         boolean sorted= false;
         for(int i=0;i<arr.length-1;i++){
             if(arr[i]<arr[i+1]){
                 sorted=true;
             } else{
                 sorted= false;
                 break;
             } 
         }
         
         if(sorted){
             System.out.print("yes");
             return;
         }
         
         int operations = 0;
         int[] brr = new int[arr.length]; 
         for(int i=0;i<arr.length; i++){
             brr[i]=arr[i];
         }
         
         Arrays.sort(arr); // arr --> 1,2,3,4,5,6
                           // brr --> 1,5,4,3,2,6
                            // 1,2,4,3,2,6
                             // 1,2,3,3,2,6
                              // 1,2,3,4,2,6
         
        
                              
         for(int i=0;i<arr.length ;){
             for(int j=0;j<brr.length;){ // {1,3,4,5,6,7};
                                         // {1,3,4,7,5,6};
                                         
                                         //{1,2,3,4,5,6} 
                                         //{1,5,4,3,2,6};
                                         
                                         //{1,2,3}
                                         //{3,1,2};
                                         
                                         //{2,3,4,5}
                                         //{2,3,5,4}
                                         
                 if(brr[j]!=arr[i]){
                        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
                        int x = arr[i];
                        map.put(x,i);
                        while(brr[j]!= x){
                        brr[j] = arr[i]; 
                        operations++;
                        j++;
                        i++;
                    }
                    brr[j] = arr[i];
                     if(Arrays.equals(arr,brr)){
                        if(operations>2){
                            System.out.println("yes");
                            System.out.print("reverse " + (map.get(x)+1) +" "+ (j+1) );
                        }else{
                            System.out.println("yes");
                            System.out.print("swap " + (map.get(x)+1)+ " "+ (j+1));
                        }
                    } else{
                        System.out.print("no");
                    }
                   break;
                 }
                    if(brr[j]==arr[i]){
                     brr[j]=arr[i];
                     i++;
                    // break;
                 }
                 j++;
                 
             }
             //i = arr.length;
             break;
         }

     }
}
