
/* 
Java program for power set 
 This problem was asked by Google.given {1,2,3} --> 
{},{1},{2},{3},{1,2},{1,3},{2,3},{1,2,3} , power(2,setSize()) , 

ie. power(2,3) -->  long powSetSize = (long)Math.pow(2, setSize);  --> 8

BINARY Operations, GOOD TO KNOW
*/

import java .io.*; 
  
public class GooglePowerSet { 
   
    // Driver program to test printPowerSet 
    public static void main (String[] args) 
    { 
        int []set = {1,2,3}; 
        printPowerSet(set, 3); 
    } 
      
    static void printPowerSet(int []set, int setSize) 
    { 
        
        long powSetSize = (long)Math.pow(2, setSize); 
        int i, j; 
      
        for(i = 0; i < powSetSize; i++) 
           
        { 
           System.out.print("{");
            for(j = 0; j < setSize; j++) 
            {  
              
                if((i & (1 << j)) > 0)  // BINARY Operations, GOOD TO KNOW
                  
                    System.out.print(set[j]+",");
              
            } 
            System.out.print("}");
              
            System.out.println(); 
        } 
    } 
      
   
} 
