/*
Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow.
 Each testcase contains two lines of input. The first line of each test case is N, N is the number of digits. 
 The second line of each test case contains D[i], N number of digits.

Output:
Print all possible words from phone digits with single space.

Constraints:
1 <= T <= 10
1 <= N <= 10
2 <=  D[i] <= 9

Example:
Input:
1
3
2 3 4

Output:
adg adh adi aeg aeh aei afg afh afi 
bdg bdh bdi beg beh bei bfg bfh bfi 
cdg cdh cdi ceg ceh cei cfg cfh cfi
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PossibleWords{

   public static void main(String args[]){
      System.out.println(letterCombinations("24"));
   }
    public  static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        
        if(digits == null || digits.length() == 0) {
            return result;
        }
        
        String[] mapping = {
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        
        letterCombinationsRecursive(result, digits, "", 0, mapping);
        
        return result;
    }
    
    public static void letterCombinationsRecursive(List<String> result, String digits, String current, int index, String[] mapping) {
        if(index == digits.length()) {
            result.add(current);
            return;
        }
        
        String letters = mapping[digits.charAt(index) - '0'];
        for(int i = 0; i < letters.length(); i++) {
            letterCombinationsRecursive(result, digits, current + letters.charAt(i), index + 1, mapping);
        }
    }
}
