/*
1) Given a number 5 , find its binary format. -->101

Then find the compliment --> 010 of the binary number , and finally print the decimal convention. --> 2

No loops to be used

Ex 2: num = 7 --> 111 --> 000 (replace all 0's to 1's and vice-versa) --> finally print 0
*/

import java.util.*;
public class DecimalToBinary {
    
   public static void main(String[] args) {
      int x = 5;
      int binary[] = new int[40];
      int index = 0;
      String str = "";
      int i=0;
  
     while(x>0){
        binary[index++] = x%2;
         x = x /2;
        if(binary[i]==1){
           binary[i] =0;
           str += String.valueOf(binary[i]);

        } else{
           binary[i]=1;
               str += String.valueOf(binary[i]);

        }
        i++;
     }
      
      System.out.println(Arrays.toString(binary));
      System.out.println(Integer.parseInt(str,2)); // This Decimal precision is important 
                                                  //The Integer.parseInt() method converts string to int with given redix.

      
      
      
   }
}
