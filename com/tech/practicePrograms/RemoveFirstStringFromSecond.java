/*
Remove characters from the first string which 
are present in the second string

first String = "geeksforgeeks";
second String = "masks";

output: geeforgee

first String = "geeksforgeeks";
second String = "masked";

output: gforg

*/
import java.util.*;
public class RemoveFirstStringFromSecond {
   public static void main(String[] args) {
      String firstString = "geeksforgeeks";
      String secondString = "masks";
      // Expected result = "geekforgeek";
      
      removeChars(firstString, secondString);
   }
   
   private static String removeChars(String fStr, String sStr){
   char[] fChar = fStr.toCharArray();
   char[] sChar = sStr.toCharArray();
    
      for(int i=0;i<sChar.length; i++){
         for(int j=0;j<fChar.length;j++) {
            if(sChar[i] == fChar[j]){
              fChar[j]=' '; 
            }
         }
      }
      
      fStr = String.valueOf(fChar);
       fStr =  fStr.replaceAll("\\s", ""); 
      System.out.print(fStr);
   return fStr;
   }
}
