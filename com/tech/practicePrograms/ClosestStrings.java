import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * You are given a array of string followed by two words.
 *  You have to find the minimum distance between the two words 
 *  in the given array of string

 For example:
(“the”, “quick”, “brown”, “fox”, “quick”)
distance(“fox”,”the”) = 3
distance(“quick”, “fox”) = 1

Input:The first line consists of  a integer T denoting 
the number of test cases .Each test case consists of three lines .
First line consists of an integer N denoting the size of array of strings .
Second line consists of N spaced strings made of 'a' to 'z' .
Third line consists of two spaced strings s1,s2 for which you have two 
find minimum distance.


Output:The output consists of a single line for each testcase 
which is the minimum distance between the two given strings.
Constraints:

1<=T<=1000

1<=N<=100

1<=size of strings of array<=100

It is given that s1 and s2 will always be present in the array
Example:

Input:

1

5

the quick brown fox quick

fox the

Output:

3

Expected time complexity

O(n)
 * @author vivedula
 *
 */
public class ClosestStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] stringArray = {"the", "the", "quick", "silver", "brown", "frox", "quick", "sam", "fox"};
		distance("the", "fox", stringArray);
	}
	
	private static int distance(String s1, String s2, String[] stringArray){
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		int distance = 1;
			for(int i=0; i < stringArray.length ; i++){
				if(stringArray[i] == s1){
					list1.add(i);
				} else if (stringArray[i] == s2){
					list2.add(i);
					
				}
			}
		System.out.println(list1 + ""+ list2);
		
		List<Integer> finalList = new ArrayList<>();
		if(list1.size() > list2.size()-1){
			for (int j = 0; j < list1.size(); j++) {
				for(int i=0; i < list2.size(); i++){
					finalList.add(Math.abs(list1.get(j)-list2.get(i)));
				}
				
			}
		} else {
			for (int j = 0; j < list1.size(); j++) {
				for(int i=0; i < list2.size(); i++){
					finalList.add(Math.abs(list1.get(j)-list2.get(i)));
				}
				
			}
		}
		Collections.sort(finalList);
		distance = finalList.get(0);
		System.out.println(finalList.get(0));
		return distance;
	}
}
