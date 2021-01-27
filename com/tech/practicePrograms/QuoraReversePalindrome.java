/*
Problem Statement by QUORA:
Given a string , find its palindrome that can be made by inserting
the fewest number of characters as possible anywhere in the word.
*/
public class QuoraReversePalindrome {
   public static void main(String[] args) {
      String str = "google";
      System.out.println(initiatePalindrome(str));
   }
   
   static String initiatePalindrome(String s){
      int count=0;
      String reverse = new StringBuilder(s).reverse().toString(); // first reverse it
      String append = Character.toString(reverse.charAt(0)); //always append the first char
      // of reversed String
     
      for(int i=0;i<s.length();i++){
         
         if(i!=0){
             append = append + Character.toString(reverse.charAt(i)); //keep appending the backward chars to original String
             count++;
         }
         
          
         if (findPalindrome(append+s)){ //keep checking acutal palindrome logic
            System.out.println("Total number of permutations :"+(count+1));
            return append+s;
         } else{
            continue;
         }
      }
      
      return "";
   }
   
   static boolean findPalindrome(String s){
      String finalReverse = new StringBuilder(s).reverse().toString();
      if(finalReverse.equals(s)){
        return true;  
      } else{
       return false;  
      } 
      
   }
}
