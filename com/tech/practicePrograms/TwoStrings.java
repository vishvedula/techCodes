/**Given two strings, determine if they share a common substring. A substring may be as small as one character.

For example, the words "a", "and", "art" share the common substring

. The words "be" and "cat" do not share a substring.

Function Description

Complete the function twoStrings in the editor below. It should return a string, either YES or NO based on whether the strings share a common substring.

twoStrings has the following parameter(s):

    s1, s2: two strings to analyze .

Input Format

The first line contains a single integer

, the number of test cases.

The following

pairs of lines are as follows:

    The first line contains string 

.
The second line contains string

    .

Constraints

and
consist of characters in the range ascii[a-z].

Output Format

For each pair of strings, return YES or NO.

Sample Input

2
hello
world
hi
world

Sample Output

YES
NO
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();
        int length1 = s1.length();
        int length2 = s2.length();
        boolean exists = false;
       if(length1 > length2){
           for(int i =0; i< length2; i++){
               for(int j=0;j<length1;j++){
                   if(array2[i]==array1[j]){
                       exists = true;
                       break;
                   }
               }
           }
       } else {
           for(int k=0; k< length1; k++){
               for(int l=0;l<length2;l++){
                   if(array1[k]==array2[l]){
                       exists = true;
                       break;
                   }
               }
           }
       } 

       if(exists){
           return "YES";
       } else {
           return "NO";
       }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

