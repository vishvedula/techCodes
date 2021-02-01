/*Java program to find number of subsets for a given number
 Logic is to find the PowerSet and then compute each set's 
sum to the given number 

Ex:  int[] set = {1,4,7,10}; and given n= 10, then we should calculate all the sets as following and compare their sum with 10
1,
4,
1,4,
7,
1,7,
4,7,
1,4,7,
10, --> TRUE
1,10,
4,10,
1,4,10,
7,10,
1,7,10,
4,7,10,
1,4,7,10,
Count of subsets summing to the given number are :1

Ex2: int[] set = {2,4,6,10}; and given n= 16, then we should calculate all the sets as following and compare their sum with 16
2,
4,
2,4,
6,
2,6,
4,6,
2,4,6,
10,
2,10,
4,10,
2,4,10, --> TRUE
6,10, --> TRUE
2,6,10,
4,6,10,
2,4,6,10,
Count of subsets summing to the given number are :2

*/

import java .io.*; 
  
public class AmazonFindSubsetsAndSum { 
   
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
