/**
 * Given a positive number x, print all Jumping Numbers 
 * smaller than or equal to x. A number is called as a Jumping Number 
 * if all adjacent digits in it differ by 1. The difference between ‘9’ and ‘0’ 
 * is not considered as 1. All single digit numbers are considered as Jumping Numbers. 
 * For example 7, 8987 and 4343456 are Jumping numbers but 796 and 89098 are not.

Input:
The first line of the input contains T denoting the number of 
testcases. Each testcase contain a positive number 'x'.
Output:
All the jumping numbers less than 'x' are generated in 
increasing order of the most significant digit. See example for better understanding.


Constraints:
1 <=T<= 100
1 <=N<= 100000


Example:
Input:
2
10
50
Output:
0 1 10 2 3 4 5 6 7 8 9
0 1 10 12 2 21 23 3 32 34 4 43 45 5 6 7 8 9
 * @author vivedula
 *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JumpingNumbers {
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i <=number ; i++){
			list.add(i);
		}
	    findJumpingNumber(list);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void findJumpingNumber(List list){
		List finalList = new ArrayList<>();
			for(int j=0; j <=list.size()-1; j++){
				int num = (int) list.get(j);
				if(num<=10){
					finalList.add(num);
				} else{
					int rem=0;
					int diff = 0;
					rem = num % 10;
					num = num / 10;
					diff = Math.abs(num - rem);
					if (diff == 1) {
						finalList.add(list.get(j));
					}
				}
			}
			System.out.println(finalList);
	}
}
