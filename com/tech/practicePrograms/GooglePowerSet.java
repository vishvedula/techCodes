// Java program for power set 
// This problem was asked by Google.given {1,2,3} --> {},{1},{2},{3},{1,2},{1,3},{2,3},{1,2,3} , power(2,setSize())

import java .io.*; 
  
public class GooglePowerSet { 
      
    static void printPowerSet(char []set, 
                            int set_size) 
    { 
          
        /*set_size of power set of a set 
        with set_size n is (2**n -1)*/
        long pow_set_size =  
            (long)Math.pow(2, set_size); 
        int counter, j; 
      
        /*Run from counter 000..0 to 
        111..1*/
        for(counter = 0; counter <  
                pow_set_size; counter++) 
        { 
            for(j = 0; j < set_size; j++) 
            { 
                /* Check if jth bit in the  
                counter is set If set then  
                print jth element from set */
                if((counter & (1 << j)) > 0) 
                    System.out.print(set[j]); 
            } 
              
            System.out.println(); 
        } 
    } 
      
    // Driver program to test printPowerSet 
    public static void main (String[] args) 
    { 
        char []set = {'1', '2', '3'}; 
        printPowerSet(set, 3); 
    } 
} 
