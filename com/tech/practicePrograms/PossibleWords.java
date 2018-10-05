/*
Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow.
 Each testcase contains two lines of input. The first line of each test case is N, N is the number of digits. 
 The second line of each test case contains D[i], N number of digits.

Output:
Print all possible words from phone digits with single space.

Constraints:
1 <= T <= 10
1 <= N <= 10
2 <=  D[i] <= 9

Example:
Input:
1
3
2 3 4

Output:
adg adh adi aeg aeh aei afg afh afi 
bdg bdh bdi beg beh bei bfg bfh bfi 
cdg cdh cdi ceg ceh cei cfg cfh cfi
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PossibleWords{
	public static void main(String args[]){
		possibleWords();
	}

	private static List<String> possibleWords(){
		List<String> list = new ArrayList<String>();
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(2,"abc");
		map.put(3,"def");
		map.put(4,"ghi");
		map.put(5,"jkl");
		map.put(6,"mno");
		map.put(7,"pqr");
		map.put(8,"stu");
		map.put(9,"vwx");
		map.put(0, "yz");

		Scanner scan = new Scanner(System.in);
		int[] input = new int[scan.nextInt()];
		for(int i =0; i < input.length; i++){
			input[i] = scan.nextInt(); // {2,3,4};
		}
		

		for(int i=0;i<map.get(input[0]).length(); i++){
			StringBuilder strA= new StringBuilder();
			//strA.append(map.get(input[0]).charAt(i));
			for(int j=0; j<map.get(input[1]).length(); j++){
				strA = new StringBuilder();
				strA.append(map.get(input[0]).charAt(i));
				StringBuilder strB = new StringBuilder();
				strB.append(map.get(input[1]).charAt(j));
				strA.append(strB);
				for(int k=0; k < map.get(input[2]).length(); k++){
					StringBuilder finalStr = new StringBuilder();
					StringBuilder strC = new StringBuilder();
					strC.append(map.get(input[2]).charAt(k));
					finalStr.append(strA).append(strC);
					list.add(finalStr.toString());
				}
			}
		}
		System.out.println(list);
		return list;

	}
}