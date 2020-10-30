/*
 *  Problem statement

Given a list of strings, sort the strings in lexicographical order (dictionary order).
Input

First line of input will contain a number T = no, of test cases. Each test case will contain 2 lines. First line will contain N = number of strings in a list. 
Next line will contain N strings comprising of only lower case letters ('a' to 'z') separated by space.
Output

For each test case, print on a single line, the strings as space separated list in lexicographical order (dictionary order). There should be no space after last element in the list.

Sample Input :

3
6
program sort loop sentence fragment bracket
5
wheel car mile meter yard
10
cat rat bat hat vat mat pet set met fat 

Sample Output :

bracket fragment loop program sentence sort
car meter mile wheel yard
bat cat fat hat mat met pet rat set vat

Explanation

Lexicographical order is the order in which strings will occur in dictionary.

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringInLexicographicalOrder {

	@SuppressWarnings({"resource" })
	public static void main(String args[]) {

		System.out.println("Number of Testcases to be run are: ");
		Scanner parentScan = new Scanner(System.in);
		int noOfTestCases = parentScan.nextInt();
		
		for(int number=0; number<noOfTestCases; number++){
			//System.out.println("Length of String is: "+ parentScan.nextInt());
			parentScan.nextInt();
			//String str = parentScan.next();
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			StringTokenizer token;
			try {
				token = new StringTokenizer(reader.readLine().toString());
				int countTokens = token.countTokens(); // gives 6
				
				String a[] = new String[countTokens];
				while (token.hasMoreElements()) {

					for (int i = 0; i < countTokens; i++) {
						a[i] = token.nextToken();

					}
				}
				// System.out.println(Arrays.toString(a));

				// Call the sorting logic method
				printLexicoOrder(a);
				List<String> aList = new ArrayList<String>();
				for (int j = 0; j < countTokens; j++) {
					aList.add(a[j]);
				}
				System.out.println(""+aList.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}
		//String str = "program sort loop sentence fragment bracket";
		
	}

	public static void printLexicoOrder(String x[]) {
		int j;
		boolean flag = true; // will determine when the sort is finished
		String temp;

		while (flag) {
			flag = false;
			for (j = 0; j < x.length - 1; j++) {
				if (x[j].compareToIgnoreCase(x[j + 1]) > 0) { // ascending sort
					temp = x[j];
					x[j] = x[j + 1]; // swapping
					x[j + 1] = temp;
					flag = true;
				}
			}
		}
	}
}
