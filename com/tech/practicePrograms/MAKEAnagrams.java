/**
 * This code is to make 2 Strings ANAGRAM
 */
package com.thread.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MakeAnagram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String aString = line;
        line = br.readLine();
        String bString = line;
 
        int[] counts = new int[26];
        char a = 'a';
 
        char[] charArray = aString.toCharArray();
 
        for (int i = 0; i < charArray.length; i++) {
            counts[charArray[i] - a]++;
        }
		
        charArray = bString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            counts[charArray[i] - a]--;
        }
		
        int sum = 0;
        for(int i = 0 ; i < counts.length ;i++){
            sum+= Math.abs(counts[i]);
        }
		
        System.out.println(sum);
    }
}
