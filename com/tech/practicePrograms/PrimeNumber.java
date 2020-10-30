import java.util.Scanner;

public class PrimeNumber {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int limit = scan.nextInt();
		for (int i = 0; i < limit; i++) {
			calculatePrime(Integer.valueOf(scan.next()));
		}

	}

	static void calculatePrime(int number) {
		boolean isPrime= true;
		if (number == 2) {
			System.out.println("PRIME");
		} else if (number == 0 || number == 1) {
			System.out.println("NOT PRIME");
		} else {
			for (int j = 2; j <= number/2; j++) {
				if (number % j == 0) {
					isPrime = false;
					break;
				} 
				
			}
			if(isPrime)
				   System.out.println("PRIME");
				else
				   System.out.println("NOT PRIME");
			   }
		}
	}
