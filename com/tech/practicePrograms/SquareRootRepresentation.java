/**
 * 
Check whether a number can be represented by sum of two squares
2.5

We have a number n. We need to find whether number n can be represented by the sum of two squares.

Examples:

Input  : n = 17
Output : Yes
4^2 + 1^2 = 17

Input  : n = 169
Output : Yes
5^2 + 12^2 = 169

Input : n = 24
Output : No

Brute-force approach – O(n)
We use two for loop running till squareroot of n and each time we will 
check whether the sum of square of both numbers of loop is equal to N.
If we found that combination then we will print Yes otherwise No.

for i=1 to sqrt(n)
   for j=i to sqrt(n)
       if (i*i+j*j == n)
           return true;
return false;

 * @author vishalvedula1
 *
 */
public class SquareRootRepresentation {
	
	public static void main(String args[]){
		int number = 100;
		squareRoot(number); 
	}

	private static boolean squareRoot(int number){
		for(int i=1; i*i <=number; i++){
			for (int j=1; j*j<= number; j++){
				if(i*i + j*j ==number){
					System.out.println("true");
					return true;
				}
			}
		}
		System.out.println("false");
		return false;
	}
}
