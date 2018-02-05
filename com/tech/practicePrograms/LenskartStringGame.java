/**
 * String Game

Player1
and Player2 decided to play a game. The game comprises of a String S

which consist of lowercase English alphabets only and both players take alternative terms.

In each turn, a Player choose a character present in the string and remove all 
occurrences of the character. For each player to play his turn, there should be at least one character in the string. 
The Player who is not able to play his turn loses.

Your task is to find the winner of the game, if both the players play optimally and Player1

plays the first turn.

Input Format :
The input starts with an integer T
, the number of test cases.
Each test case contains an String S

on a new line.

Output Format:
Print "Player1
" if Player1 Wins or "Player2" if Player2

Wins (without quotes). For each test case, print the output in new line.

Constraints:
1≤T≤10

1≤length of String S≤105



All characters are lowercase English alphabets.
Sample Input

1
aba

Sample Output

Player2


 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Player1Player2 {

	private static String Player1 = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    String name = s.nextLine();                 // Reading input from STDIN
	    char[] a = name.toCharArray();  // Writing output to STDOUT
	     
	    printWinner(a);

	}
	
		private static String printWinner(char[] a){
		
		int iteration = 0; // To use "iteration" count for figuring if Player1 wins of Player2 wins
		int aLength = a.length;
		List<Character> list = new ArrayList<>();
		for(int k=0; k < aLength; k++){
			list.add(a[k]);
		}
		int size = list.size();
			for(int i=0; i < size; ){
				int count =0;
				++iteration;
				for(int j=i+1; j<size; j++){
					if(list.get(i)==list.get(j)){
						list.remove(j);
						count++;
						size = list.size();
					}
				}
				list.remove(i);
				size = list.size();	
			}
			
		if(iteration%2 == 0){
			System.out.println("Player2");
		} else {
			System.out.println("Player1");
		}
		
		return Player1;
	}
}
  //-------------------------------------------------------Below code for better Time complexity----------------------
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class LenskartSstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char[] a = str.toCharArray();
		lenskartString(a);

	}

	private static String lenskartString(char[] a){
		List<Character> list = new ArrayList<>();
		int count = 0;
		for(int i=0; i < a.length; i++){
			list.add(a[i]);
		}
		System.out.println(list);
		Set<Character> set = new HashSet<Character>(list);
		System.out.println(set);
		
		 count = set.size();
		if(count % 2 ==0){
			System.out.println("Player2");
		} else {
			System.out.println("Player1");
		}
		return "Player1";
	}
	
}

