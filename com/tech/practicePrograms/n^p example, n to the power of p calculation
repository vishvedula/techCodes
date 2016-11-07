/*
Create a class MyCalculator which consists of a single method power(int,int). This method takes two integers,  and , as parameters and finds . 
If either  or  is negative, then the method must throw an exception which says "n and p should be non-negative".

Please read the partially completed code in the editor and complete it. Your class mustn't be public.

No need to worry about constraints, there won't be any overflow if your code is correct.

Sample Input

3 5
2 4
-1 -2
-1 3
Sample Output

243
16
java.lang.Exception: n and p should be non-negative
java.lang.Exception: n and p should be non-negative

*/

import java.io.*;

public class NumberToPower {

	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number;
		int power;
		int result;
		try {
			System.out.println("Enter the inputs");
			number = Integer.parseInt(br.readLine());
			power = Integer.parseInt(br.readLine());

			if (number < 0 || power < 0) {
				throw new Exception("n and p should be non-negative");
			}
			
			result = power(number, power);
			System.out.println("result is "+ result);
		} catch (Exception e) {
			System.out.println("java.lang.Exception: n and p should be non-negative");
			
		}

	}

	private static int power(int n, int p) {
		int result=1;
		try{
			
				while(p>=1){
					int originalNumber = n;
					 result= result * originalNumber;
					p--;
				}
				
			} catch(Exception e){
			//System.out.println("java.lang.Exception: n and p should be non-negative");
		}
		return result;
	}
}
