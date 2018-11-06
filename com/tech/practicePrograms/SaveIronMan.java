import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Jarvis is weak in computing palindromes for Alphanumeric characters.
While Ironman is busy fighting Thanos, he needs to activate sonic punch but Jarvis is stuck in computing palindromes.
You are given a string S containing alphanumeric characters. Find out whether the string is a palindrome or not.
If you are unable to solve it then it may result in the death of Iron Man.

Input:
The first line of the input contains T, the number of test cases. T testcases follow.  
Each line of the test case contains string 'S'.

Output:
Each new line of the output contains "YES" if the string is palindrome and "NO" if the string is not a palindrome.

Constraints:
1<=T<=100
1<=|S|<=100000
Note: Consider alphabets and numbers only for palindrome check. Ignore symbols and whitespaces.

Example:
Input:
2
I am :IronnorI Ma, i
Ab?/Ba

Output:
YES
YES
 * @author vivedula
 *
 */
public class SaveIronMan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List list = new ArrayList<String>();
	    for(int i=0;i<n;i++){
	    	Scanner scan1 = new Scanner(System.in);
	    	String st = scan1.next();
	    	list.add(testPalindrome(st));
	    }
	    for(int i=0;i<list.size();i++){
	    	System.out.println(list.get(i));
	    }
	}

	private static String testPalindrome(String str){
		// first remove white space and concatenate entire string
		// ignoring case sensitivity
		String newStr = str.replaceAll("[^a-zA-Z]", "").trim();
		//now logic for palindrome check
		return palindrome(newStr.toLowerCase());
		
	}
	
	private static String palindrome(String st){
		StringBuilder strBuild = new StringBuilder(st);
		strBuild.reverse();
		if(strBuild.toString().equals(st)){
			return "YES";
		} else{
			return "NO";
		}
		
	}
}
