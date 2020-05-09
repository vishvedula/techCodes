/**
Sherlock considers a string to be valid if all characters of the string appear the same number of times. 
It is also valid if he can remove just 1 character at 1 index in the string, and the remaining 
characters will occur the same number of times. 
Given a string , determine if it is valid. If so, return YES, otherwise return NO.

Sample Input 0

aabbcd

Sample Output 0

NO

Explanation 0

Given aabbcd
, we would need to remove two characters, 
both c and d -->aabb or a and b -->abcd, to make it valid. We are limited to removing only one character, so is invalid.

=====

Sample Input 1

aabbccddeefghi

Sample Output 1

NO

Explanation 
frequencies of many characters differ

====

Sample Input 2

abcdefghhgfedecba

Sample Output 2

YES

Explanation
Frequency of e--> 3, rest for all is 2 , so removig 'e' once will suffice and solve the problem


*/

import java.util.*;

public class SherlockValidStrings {
    public static void main(String args[]){
        String str = "abcdefghhgfedecbaf";
        isValidString(str);
    }

    static String isValidString(String str){

        String result = "";

        char[] arr = str.toCharArray(); // converting to array of characters

        Arrays.sort(arr);
        // below collections are used to store <K,V> --> <Character, FrequencyCount>
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        List<Character> list = new ArrayList<Character>();
        Set<Character> set  = new HashSet<Character>();
        for(int l=0;l<arr.length;l++){
            set.add(arr[l]); // store the distinct characters
        }
        for(Character c : set){
            map.put(c,1); // set the default value for all characters as 1 (initially)
        }
        int difference = 0; // if the diff is 1 , given that only 1 character differs, then YES
        boolean isValid = false;
        for(int i=0;i<arr.length-1;i++){
            int temp=map.get(arr[i]);
            difference = temp;
            if(arr[i]==arr[i+1]){
                map.put(arr[i],++temp); // set the actual count of the characters along with their frequency
            } 
            difference = temp;
        }
        
        for(Character c: map.keySet()){
           if(difference != map.get(c)){
            list.add(c);
            if(Math.abs(difference - map.get(c)) == 1 && list.size()==1){ // judging factor
                isValid = true;
            } else {
                isValid = false;
            }
           }
        }
        //System.out.print(temp);
        System.out.print(map);
        if(isValid){
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        return result;
    }
    
}
