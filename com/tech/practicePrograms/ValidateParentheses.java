/*

This problem was asked by Facebook.

Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).

For example, given the string "([])[]({})", you should return true.

Given the string "([)]" or "((()", you should return false.

Logic would be to use Stack and solve this issue

*/

import java.util.*;
import java.util.Stack;
public class ValidateParentheses {
   final static String str= "([])[)({})";
   public static void main(String args[]){
  
   Stack<Character> stack = new Stack<>();
   
   
   System.out.print("isValid: "+validateParentheses(str, stack));
   }
   
   
   static boolean validateParentheses(String str, Stack<Character> stack){
      boolean isValid = true;
      for(int i=0;i<str.length();i++){
             char c = str.charAt(i);
             if(c == '(' || c == '[' || c == '{')
             {
               stack.push(c); 
             } else if(c==')'){
                 if(stack.pop()!='('){
                    isValid = false;
                     return false;
                 }
              }else if(c==']'){
                 if(stack.pop()!='['){
                     isValid = false;
                     return false;
                 }
            }else if(c=='}'){
                 if(stack.pop()!='{'){
                    isValid = false;
                    return false;
                 }
            }
      }
      return isValid;
   }
}
        
