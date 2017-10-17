/**
 * Given a list of contacts which exist in a phone directory. The task is to implement search query for the phone directory. 
 * The search query on a string ‘str’ displays all the contacts which prefix as ‘str’. One special property of the search function is that, when a user searches for a contact from the contact list then suggestions (Contacts with prefix as the string entered so for) are shown after user enters each character.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. 
Each test case contains three lines. First line of each test case contains N i.e., number of contacts. Second line contains space separated all the contacts in the form of string. And third line contains query string.

Output
For each test case, print the query results in new line. If there is no match between query and contacts, print "0".

Example:
Input:
1
3
geeikistest geeksforgeeks geeksfortest
geeips

Output:

geeikistest geeksforgeeks geeksfortest
geeikistest geeksforgeeks geeksfortest
geeikistest geeksforgeeks geeksfortest
geeikistest
0
0

 * @author vivedula
 *
 */

public class SearchString {
	
	public static void main(String args[]){
		String[] strArray = {"geeikistest", "geeksforgeeks", "geeksfortest"};
		String testString = "geeips";
		StringBuffer  strBuff = new StringBuffer();
		
		char[] ch = testString.toCharArray();
		int strArrayLength = strArray.length;
		int testStringLength = testString.length();
		for(int i=0; i <testStringLength; i++){
			strBuff = new StringBuffer();
			int count =0;
			for(int j=0; j< strArrayLength ; j++){
				char[] chList = strArray[j].toCharArray();
				if(ch[i] == chList[i]){
					strBuff.append(strArray[j]);
					strBuff.append(' ');
					count++;
				} 
				if(count ==0){
					strBuff = new StringBuffer();
					strBuff.append('0');
				}
			}
			
			System.out.println(strBuff);
		}
	}

}
