/*
Rearrange a string in sorted order followed by the integer sum

Input : AC2BEW3
Output : ABCEW5
Alphabets in the lexicographic order 
followed by the sum of integers(2 and 3).

Input : ACCBA10D2EW30
Output : AABCCDEW6
*/

import java.lang.*;
import java.util.*;

public class ReArrangeString {
   public static void main(String args[]){
      String str = "ACCBA10D2EW30";
      
      System.out.println(reArrangeString(str));
   }
   
   
   static String reArrangeString(String str) {
      String finalStr = "";
      int sum =0;
      for( int i=0;i<str.length();i++){
          if(!Character.isDigit(str.charAt(i))){ // To Add Characters to String
             finalStr += str.charAt(i);
           }
         
         if(Character.isDigit(str.charAt(i))){
            sum +=Integer.parseInt(String.valueOf(str.charAt(i))); // To Add theIntegers
         }
    
      }
      char[] arr = finalStr.toCharArray();
      Arrays.sort(arr); // sort the String
     
      finalStr = String.valueOf(arr);
      
      finalStr +=String.valueOf(sum);  // Finally add the Integer at last
      
      return finalStr;
      
  }
}
