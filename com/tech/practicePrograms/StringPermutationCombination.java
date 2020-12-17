import java.util.HashSet;
import java.util.Set;

/*
 *  Problem statement

Given a string, print all its permutations in lexicographically increasing order(dictionary order).
Input

First line of test case will contain an integer T = no. of test cases. Next T lines will each contain a string comprising only of alphabets a-z. Maximum size of the string will be 5 characters. String may have duplicate characters.
Output

For each test case, print one line of output that should be space separated (exactly one space) list of all permutations of the string in lexicographical order. There should be no space after last permutation string on each line. Lexicographical order means the order in which they will exist in dictionary.

Sample Input

4
abc
bac
mad
bad

Sample Output

abc acb bac bca cab cba
abc acb bac bca cab cba
adm amd dam dma mad mda
abd adb bad bda dab dba

Sample output for ABC:

Recursive count-->1
The set of words that are returned from previous recursion -->[]
The final list of words that are computed -->[[C]]

Recursive count-->2
The set of words that are returned from previous recursion -->[C]
The final list of words that are computed -->[[BC, CB]]

Recursive count-->3
The set of words that are returned from previous recursion -->[BC, CB]
The final list of words that are computed -->[[ACB, BCA, ABC, CBA, BAC, CAB]]

Permutations for ABC are: 
[ACB, BCA, ABC, CBA, BAC, CAB]


 */

import java.util.*;
public class StringPermutations {
                    private  static  int  count=0;
		    public static Set<String> permutationFinder(String str) {
		        Set<String> perm = new HashSet<String>();
		        //Handling error scenarios
		        if (str == null) {
		            return null;
		        } else if (str.length() == 0) {  // Recursion BASE Condition
		            perm.add("");
		            return perm;
		        }
		        char initial = str.charAt(0); // first character
		        String rem = str.substring(1); // Full string without first character
		        Set<String> words = permutationFinder(rem);
                 	 ++count;
		        System.out.println("Recursive count-->"+count);
		        System.out.println("The set of words that are returned from previous recursion -->"+words);
		        for (String strNew : words) {
		            for (int i = 0;i<=strNew.length();i++){
		                perm.add(charInsert(strNew, initial, i));
		            }
		        }
                      System.out.println("The final list of words that are computed -->"+Arrays.asList(perm));
		        return perm;
		    }
		 
		    public static String charInsert(String str, char c, int j) {
		        String begin = str.substring(0, j);
		        String end = str.substring(j);
		        return begin + c + end;
		    }
		 
		    public static void main(String[] args) {
		     String s1 = "ABC";
		     System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));

		        /*String s = "AAC";
		        String s1 = "ABC";
		        String s2 = "ABCD";
		        String s3 = "A";
		        System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));
		        System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));
		        System.out.println("\nPermutations for " + s2 + " are: \n" + permutationFinder(s2));
		        System.out.println("\nPermutations for " + s2 + " are: \n" + permutationFinder(s3));*/
		    }
	}
