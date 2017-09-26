/**
Given a positive integer N, check if N is a power of 2.

Input:
The first line contains 'T' denoting the number of test cases. Then follows description of test cases.
Each test case contains a single positive integer N.


Output:
Print "YES" if it is a power of 2 else "NO". (Without the double quotes)


Constraints:
1<=T<=100
0<=N<=10^18

Example:
Input :
2
1
98

Output :
YES
NO*/

public class PowerOf2 {
	static int is2= 0;
	public static void main(String args[]) {
		int number = 120;
		number = isPowerOf2(number);
		if(is2 ==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	private static int isPowerOf2(int number) {
			int remainder = number % 2;
			if(remainder ==0 && number >2 ){
				is2 = 0;
			number =  isPowerOf2(number / 2);
			} else if(number ==2){
				is2 = 0;
			} else {
				is2 =1;
			}
		return is2;
	}
}
