/**
 * Little Bobby loves chocolate. He frequently goes to his favorite

store, Penny Auntie, to buy them. They are having a promotion at Penny Auntie.
 If Bobby saves enough wrappers, he can turn them in for a free chocolate.

For example, Bobby has n=15
to spend on bars of chocolate that cost c = 3 each. He can turn m =2 in wrappers to receive another bar.
 Initially, he buys 5 bars and has 5 wrappers after eating them. He turns in 4 of them, leaving him with 1,
  for 2 more bars. After eating those two, he has 3 wrappers, turns in 2 leaving him with wrapper and his new bar. 
  Once he eats that one, he has wrappers and turns them in for another bar.
 After eating that one, he only has wrapper, and his feast ends. Overall, he has eaten bars.
 5+2+1+1 = 9 bars
 
 Sample Input

3
10 2 5
12 4 4
6 2 2

Sample Output

6
3
5

 
 * @author vivedula
 *
 */
import java.util.Scanner;

public class ChocolateFeast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rupees = scan.nextInt();
		int costChoc = scan.nextInt();
		int chocPerWrapCount = scan.nextInt();
		System.out.println(findChocsEaten(rupees, costChoc, chocPerWrapCount));

	}

	private static int findChocsEaten(int rupees, int costChoc, int chocPerWrapCount) {
		int totalChocsEaten = 0;
		int numChocs = rupees / costChoc;
		totalChocsEaten += numChocs;
		int numWrappers = numChocs;
		while (numWrappers >= chocPerWrapCount) { 
			numChocs = numWrappers / chocPerWrapCount; 
			int rWrapper = numWrappers % chocPerWrapCount;
			totalChocsEaten+=numChocs;  
			numWrappers = numChocs + rWrapper ;
		}
		return totalChocsEaten;
	}
}
