import java.util.HashSet;
import java.util.Set;

/**
 * Given a number n, print following pattern without using any loop.

Input: n = 16
Output: 16, 11, 6, 1, -4, 1, 6, 11, 16

Input: n = 10
Output: 10, 5, 0, 5, 10

 * @author vivedula
 *
 */
public class PrintWithoutLoop {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int number = 10;
		int number = 16;
		int sum =0, count =0;
		Set<Integer> set = new HashSet();
		printWithoutLoop(number, sum, set, count);
	}
	
	@SuppressWarnings("unchecked")
	private static void printWithoutLoop(int number, int sum, Set set, int count){
			final int maxNumber = 16;
			set.add(sum);
			sum = number;
			count++;
			if(number <= 0){
				System.out.println(number);
				number+=5;
				printWithoutLoop(number, sum, set, count);
				sum = number;
			} else {
				System.out.println(number);
				if(set.contains(number) && maxNumber!=number){
					number+=5;
					printWithoutLoop(number, sum, set, count);
				} else if( maxNumber==number && count > 1){
					 System.exit(0);
				 }
				number-=5;
				printWithoutLoop(number, sum, set, count);
			}
			
			
		}

}
