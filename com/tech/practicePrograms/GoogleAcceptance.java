/**
 * The word google can be spelled in many different ways.

E.g. google, g00gle, g0oGle, g<>0gl3, googl3, GooGIe etc...

Because

g = G

o = O = 0 = () = [] = <>

l = L = I

e = E = 3

That's the problem here to solve.

And the match has to be only this single word, nothing more, nothing less.

E.g.

    'g00gle' = True,
    'g00gle ' = False,
    'g google' = False,
    'GGOOGLE' = False,
    'hey google' = False

Input Format

Exactly one line of text, e.g. 'G G00gL3' (false)

Constraints

Here are all possible cases for the letters of the word 'google':

    g = G
    o = 0 = O = () = [] = <>
    l = L = I
    e = E = 3

Output Format

Return 'True' or 'False'.

Whether there is a match or not.

Sample Input 0

google

Sample Output 0

True

Sample Input 1

g()()GI3

Sample Output 1

True


 * @author vivedula
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class GoogleAcceptance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a HashMap with below values
		/*
 		g = G
		o = O = 0 = () = [] = <>
		l = L = I
		e = E = 3
		*/
		Map<Character, List<Character>> map = new LinkedHashMap<Character, List<Character>>();
		map.put('g', Arrays.asList('g','G'));
		//map.put('o', Arrays.asList('0','O','()','[]','<>'));
		map.put('l', Arrays.asList('L','I'));
		map.put('e', Arrays.asList('E','3'));
		Scanner scan = new Scanner(System.in);
		String input = "GGLE";
		char[] cArray = input.toCharArray();
		verifyGoogle(map, cArray, input);
	}
	
	private static void verifyGoogle(Map map, char[] cArray, String input){
		
		int l = cArray.length;
		boolean isGoogle = true;
		String google = "ggle";
		if(google.length()!=l){
			System.out.println("False");
			return;
		} else {
			for (int i = 0; i < l; i++) {
				List list = new ArrayList();
				list.add(map.get(google.charAt(i)));
				List<List<Character>> list2 = list;
				for (List<Character> innerList : list2) {
					for (int j = 0; j < innerList.size(); j++) {
						if (innerList.contains(cArray[i])) {
							continue;
						} else {
							isGoogle = false;
						}
					}
				}

			}
		}
		if(isGoogle){
			System.out.println("True");
		} else{
			System.out.println("False");
		}
	}
	
}
