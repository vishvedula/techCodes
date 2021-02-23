/* Problem statement

Given two strings , find whether one string is sub-sequence of another string. sub-sequence of a string is a string that can be obtained by deleting zero or more characters from the original string.
Input

First line of input will contain an integer T = number of test cases. Next T lines will each contain two alphanumeric strings separated by space.
Output

For each test case, print "YES" if one of the strings is sub-sequence of another string. Else, print "NO". String A is sub-sequence of string B if A can be obtained by deleting zero or more characters from B.
Sample Input

5
bangalore blr
Hello hel
hey harvey
Tsunami sun
building gun

Sample Output

YES
NO
YES
YES
NO
*/

import java.util.*;
// Other imports go here
  
// Do NOT change the class name
class MySolution {
    public static void main(String[] args) {

        try{
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
           for(int i = 0; i< input ; i++) {
               
           }
            String splitString = "bangalore blr \nHello hel \nhey harvey \nTsunami sun \nbuilding gun";

            StringTokenizer tokenizer = new StringTokenizer(splitString);

            while (tokenizer.hasMoreTokens()) {
                String strNew = tokenizer.nextToken("\n").toString();
                String delim = " ";
                StringTokenizer token = new StringTokenizer(strNew, delim);
                    fetchSub(token.nextElement().toString(), token.nextElement().toString());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
       
    }

    private static String fetchSub(String str, String str2) {
        char[] charSeq1 = str.toCharArray();
        char[] charSeq2 = str2.toCharArray();
        boolean isPresent = false;
         
        for (int j = 0; j < str2.length(); j++) { // This contains the shorter string to verify for ex : 's' 'h' 'l'
            for (int i = 0; i < str.length(); i++) { // This contains the actual string 'v' 'i' 's' 'h' 'a' 'l'
                if (String.valueOf(charSeq2[j]).equals(String.valueOf(charSeq1[i]))) {
                    isPresent = true;
                    break;
                }
            } if (isPresent) {
                continue;
            } else {
                break;
            }
        }
        if (isPresent) {
            System.out.println("YES");
            return "YES";
        } else {
            System.out.println("NO");
            return "NO";
        }
    }
}
