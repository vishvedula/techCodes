import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Given a number line from -infinity to +infinity. You start at 0 and can go either to the left or to the right. 
 * The condition is that in i’th move, you take i steps. You are given a Destination , 
 * you have to print the minimum number of steps required to reach that destination.

Input:
The first line of the input contains the number of test cases T, 
then T lines follow and each lines contains an integer D specifying the destination.


Output:
Corresponding to each test case print in a new line the minimum number of steps required to reach that destination.

Constraints:
1<=T<=100
0<=D<=1000

Example:
Input:
2
2
10

Output:
3
4

Explanation:

In the first test case we can go from 0 to 1 (1 step) and then from 1 to -1 (2 steps) and then from -1 to 2 (3 steps). 
So in 3 steps we have reached our destination by taking i steps in ith turn.
 */
public class MinimumSteps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		List list = new ArrayList<Integer>();
		for(int i=0; i< number; i++){
		  	list.add(findMinimumSteps(scan.nextInt()));  
		}
		 for(int i=0;i<list.size();i++){
		    	System.out.println(list.get(i));
		    }
	}

	private static int findMinimumSteps(int n){
		int count =0;
		int[] a = new int[n*2+1];
		for(int i =0; i <= n*2 ; i++){
			a[i] = Integer.valueOf(i-n);
			//System.out.print(a[i]+" ");
		}
		for(int i=1, j = n; a[j]!=n ;i++){
			count = i;
			if(i==1){
				j=j+i;
			} else if((a.length-1)-j < i) {
				j=j-i;
			} else{
				j=j+i;
			}
			if((j+i==a.length-1 && a[j]==n) || j==a.length-1)
				break;
			
		}
		return count;
	}
}
