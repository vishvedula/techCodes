/*
Input : dict = {"ale", "apple", "monkey", "plea"}   
        str = "abpcplea"  
Output : apple

Input  : dict = {"pintu", "geeksfor", "geeksgeeks", 
                                        " forgeek"} 
         str = "geeksforgeeks"
Output : geeksgeeks
*/

package com.practice;

import java.util.Arrays;
import java.util.Vector;

public class LongestStringDictionary {
	// Returns true if str1[] is a  
    // subsequence of str2[]. m is  
    // length of str1 and n is length of str2  
    static boolean isSubSequence(String str1, 
                                String str2)  
    { 
        int m = str1.length(), n = str2.length(); 
  
        int j = 0; // For index of str1 (or subsequence)  
  
        // Traverse str2 and str1, and compare current  
        // character of str2 with first unmatched char  
        // of str1, if matched then move ahead in str1  
        for (int i = 0; i < n && j < m; i++) 
        { 
            if (str1.charAt(j) == str2.charAt(i))  
            { 
                j++; 
            } 
        } 
  
        // If all characters of str1  
        // were found in str2  
        return (j == m); 
    } 
  
// Returns the longest String  
// in dictionary which is a  
// subsequence of str.  
    static String findLongestString(Vector<String> dict,  
                                            String str) 
    { 
        String result = ""; 
        int length = 0; 
  
        // Traverse through all words of dictionary  
        for (String word : dict) 
        { 
              
            // If current word is subsequence of str  
            // and is largest such word so far.  
            if (length < word.length() && 
                isSubSequence(word, str)) 
            { 
                result = word; 
                length = word.length(); 
            } 
        } 
  
        // Return longest String  
        return result; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        String[] arr = {"ale", "apple", "monkey", "plea","applea"}; 
        Vector dict = new Vector(Arrays.asList(arr)); 
        String str = "abpcplea"; 
        System.out.println(findLongestString(dict, str)); 
    } 
}
