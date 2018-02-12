/**
 * Samantha and Sam are playing a game. They have 'N' balls in front of them,
 *  each ball numbered from 0 to 9, except the first ball which is numbered from 1 to 9. 
 *  Samantha calculates all the sub-strings of the number thus formed, one by one. If the sub-string is S, 
 *  Sam has to throw 'S' candies into an initially empty box. At the end of the game, Sam has to find out the total number of candies in the box, T.
 *   As T can be large, Samantha asks Sam to tell T % (109+7) instead. If Sam answers correctly, he can keep all the candies. 
 *   Sam can't take all this Maths and asks for your help.

Help him!

Input Format

A single line containing a string of numbers that appear on the first, second, third ball and so on.

Constraints

Output Format

A single line which is the number of candies in the box,

Sample Input 0

16

Sample Output 0

23

Explanation 0

The substring of number 16 are 16, 1 and 6. Whose sum is 23.

Sample Input 1

123

Sample Output 1

164

Explanation 1

The sub-strings of 123 are 1, 2, 3, 12, 23, 123 which sums to 164. 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SamAndSubStrings {

	/**
	 * @param args
	 */

	    static int substrings(String balls) {
	    	// Take the string and add the subStrings to the list
	    	// finally calculate the total sum
	    	int result = 0;
	    	List<Integer> list = new ArrayList<>();
	    	//list.add(Integer.parseInt(balls));
	    	int length = balls.length();
	    	for(int i=0; i<length; i++){
	    	for(int j=length;j>i; j--){
	    	 list.add(Integer.parseInt(balls.substring(i, j)));

	    	 }
	    	}
	    	for(int k=0;k<list.size();k++){
	    		result+= list.get(k);
	    	}
		return result;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String balls = in.next();
	        int result = substrings(balls);
	        //substrings(balls);
	        in.close();
	    }
	}
