import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Today, Monk went for a walk in a garden. There are many trees in the garden and each tree has an 
 * English alphabet on it. While Monk was walking, he noticed that all trees with vowels on it are not in good state. 
 * He decided to take care of them. So, he asked you to tell him the count of such trees in the garden.
Note : The following letters are vowels: 'A', 'E', 'I', 'O', 'U' ,'a','e','i','o' and 'u'.

Input:
The first line consists of an integer T denoting the number of test cases.
Each test case consists of only one string, each character of string denoting the alphabet
 (may be lowercase or uppercase) on a tree in the garden.


SAMPLE INPUT

2
nBBZLaosnm
JHkIsnZtTL

SAMPLE OUTPUT

2
1



Output:
For each test case, print the count in a new line.
 * @author vivedula
 *
 */
public class MonkTakesWalk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Character> list = new ArrayList<Character>();
		list.add('A');
		list.add('E');
		list.add('I');
		list.add('O');
		list.add('U');
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		for(int i=0;i<testCase; i++){
		String str = scan.next();
		str = str.toUpperCase();
		char[] cArray = str.toCharArray();
		
		findVowels(cArray, list);
		}
	}

	
	private static int findVowels(char[] cArray, List<Character> list){
		int count = 0;
		
		for(int i=0;i<cArray.length; i++){
			if(list.contains(cArray[i])){
				count++;
			}
		}
		System.out.println(count);
		return count;
	}
}
