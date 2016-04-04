import java.util.Scanner;

/*Problem statement

Given a natural number, find the sum of all its digits.
Input

First line will contain T = number of test cases. Next T lines will each contain a non-negative integer N.
Output

For each test case, print on a separate line, the sum of its digits. 

Sample Input

5
123
321
2345
1234
12

Sample Output

6
6
14
10
3

*/



public class SumOfDigits {
	
	@SuppressWarnings("resource")
	public static void main(String args[]){
		
		Scanner scanItems = new Scanner(System.in);
		int noOfTestcases = scanItems.nextInt();
		for(int i=0; i< noOfTestcases; i++){
			printSumOfDigits(Integer.valueOf(scanItems.next()));
		}
		
	}
	
	private static void printSumOfDigits(int number){
		int sum = 0 ; //123
		int input = number;
        while (input != 0) {
            int lastdigit = input % 10; //3
            sum += lastdigit; //3
            input /= 10; //12
        }
        System.out.println(""+sum);

	}

}
