import java.util.Scanner;

/**
 * Given three strings A, B and C your task is to complete the function isInterleave 
 * which returns true if C is an interleaving of A and B else returns false. C is said to be interleaving A and B,
 *  if it contains all characters of A and B and order of all characters in individual strings is preserved.

Input:
The first line of input contains an input T denoting the no of test cases. Then T test cases follow. 
Each test case contains three space separated strings A, B, C.

Output:
For each test case output will be 1 if C is interleaving of string A and B else 0.

Constraints:
1<=T<=100
1<=length of A, B, C <=100

Example(To be used only for expected output):
Input:
2
YX  X  XXY
XY X XXY

Output
0
1

Explanation:
1. For first test case XXY is not interleaving of YX and X
2. For the sec test case XXY is interleaving of XY and X.
 * @author vivedula
 *
 */
public class InterleavedStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "XY";
		String str2 = "X";
		String result = "XXY";
		Scanner scan = new Scanner(System.in);
		findInterleaving(scan.next(), scan.next(), scan.next());

	}
	
	private static void findInterleaving(String str1, String str2, String result){
		String inter1 = str1+str2;
		String inter2 = str2+str1;
		boolean interLeaving = false;
		if(result.equals(inter1)){
			interLeaving = true;
		} else {
			if(result.equals(inter2)){
				interLeaving = true;
			}
		}
		
		if(interLeaving){
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}
		
		
	}

}
