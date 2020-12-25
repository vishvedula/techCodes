/*
Given an input string and a dictionary of words, find out if the input string can be segmented into a space-separated sequence of dictionary words. See following examples for more details.
This is a famous Google interview question, also being asked by many other companies now a days.

Consider the following dictionary 
{ i, like, sam, sung, samsung, mobile, ice, 
  cream, icecream, man, go, mango}

Input:  ilike
Output: Yes 
The string can be segmented as "i like".

Input:  ilikesamsung
Output: Yes
The string can be segmented as "i like samsung" 
or "i like sam sung".

*/

import java.util.*;
public class WordBreak
{
  static Set<String> set = new HashSet<String>();
  public static void main(String[] args) {
     String[] strArray = {"i", "like", "apple", "forever"};
     String test = "ilikeappleiiiiix";
    
     
     for(String word: strArray){
        set.add(word);
     }
     
     System.out.println(wordBreak(test));
   
  }
   
   static boolean wordBreak(String test){
      
      // Recursive call
      
      int size = test.length();
      
      if(size == 0 || test.equals("")){
         return true;
      }
      
    for(int i=1;i<=size;i++){
         
         if(set.contains(test.substring(0,i))  // prefix
             && wordBreak(test.substring(i,size))){ // suffix, leftOverLength
              return true;
            }
      }
      
     
      return false;
   }
      
      
   
   
}
