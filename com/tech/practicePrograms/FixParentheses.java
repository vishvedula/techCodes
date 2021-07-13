/*
FACEBOOK Hard LEVEL , Given a string of parentheses, find the balanced string that can be produced from it using the minimum number of insertions and deletions. If there are multiple solutions, return any of them.

For example, given "(()", you could return "(())". Given "))()(", you could return "()()()()".
*/

import java.util.Stack;
public class FixParentheses{

     public static void main(String[] args){
        System.out.println("Hello World");
        
       // String str = "())";
        String str = ")))())";
        
        fixParentheses(str);
     }
     
    static String fixParentheses(String str){
        Stack<Character> stack = new Stack<Character>();
        StringBuilder strB  = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '('){
                stack.push(str.charAt(i));
                strB.append(String.valueOf(str.charAt(i)));
                
            } else if(str.charAt(i) == ')'){
                if(!stack.isEmpty() && stack.pop() == '('){
                    strB.append(String.valueOf(str.charAt(i)));
                    continue;
                } else{
                    strB.append("(");
                    strB.append(String.valueOf(str.charAt(i)));
                }
                
            }
        }
        
        if(str.charAt(str.length()-1) == '('){
           strB.append(")");
        }
        System.out.print(strB.toString());
        return strB.toString();
    }
}
