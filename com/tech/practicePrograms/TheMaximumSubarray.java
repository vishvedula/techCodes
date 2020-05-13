/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Compiler Message

Wrong Answer

Input (stdin)
Download

    6

    1

    1

    6

    -1 -2 -3 -4 -5 -6

    2

    1 -2

    3

    1 2 3

    1

    -10

    6

    1 -1 -1 -1 -1 5

Expected Output
Download

    1 1

    -1 -1

    1 1

    6 6

    -10 -10

    5 6
 * 
 * 
 */
 
package tech_related;

import java.util.*;

/**
 *
 * @author vivedula
 */
public class TheMaximumSubarray {
    
    public static void main(String args[]){
        int[] arr = {-1,2,3,-4,5,10};
        //int[] arr= {1, -1, -1, -1, -1, 5};
        findMaxSubArrayAndSubSequence(arr);
        
    }
    
    static int[] findMaxSubArrayAndSubSequence(int[] arr){
        
        boolean negArray = false;
        int result = Integer.MIN_VALUE;
        
        int[] finalResult = new int[2];
        
        int negCount=0;
        for(int k=0;k<arr.length;k++){
            if(arr[k]<0){
                negCount++;
            } 
       }
        
        if(negCount==arr.length || arr.length==1){
            negArray = true;
        }
        
        if(!negArray){
            for(int i=arr.length-1;i>=0;i--){
                
            int sumSubArray = 0; 
            sumSubArray+=arr[i];
            
            if(sumSubArray > result){
                result = sumSubArray;
                sumSubArray=0;
                sumSubArray+=arr[i];
            }
            
            for(int j=0;j<i;j++){
                
                sumSubArray+=arr[j];
            }
            
            if(sumSubArray>result){
                result=sumSubArray;
            }
            
            
        }
        
         int sumSubSequence = 0;
         for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                
            }else{
                sumSubSequence+=arr[i];
            }
            
        }
            finalResult[0]=result;
            finalResult[1] = sumSubSequence;
       } else{
            Arrays.sort(arr);
            finalResult[0]=arr[arr.length-1];
            finalResult[1]=arr[arr.length-1];
        }
        
        
        
        return finalResult;
    }
    
}
