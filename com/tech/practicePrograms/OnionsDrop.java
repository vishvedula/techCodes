import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Given the daily price of onions per 10kgs, find the max price drop onions experienced. Price drop is defined as a 
 * decrease in price from a given day to a day in the future. 
 * What is the time complexity & space complexity of your algorithm? Is this the optimal solution?

Eg: For the onion prices: P = [21, 19, 24, 32, 30, 31, 34, 31, 31, 26, 29], the max price drop was from $34 to $26 a price drop of $8.

NOTE that maxDrop is not necessarily the difference between minPrice and maxPrice. 
For instance, in the above example minPrice=19, maxPrice=34, but the onion's price did not fall from 19 to 34, 
rather it increased from 19 to 34. So it does not constitute a maxDrop.
 * @author vivedula
 *
 */
public class OnionsDrop {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(", "); // Reading input from STDIN
		int[] a = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			a[i] = Integer.parseInt(str[i]);
		}
		findOnionsDrop(a);
	}
	
	private static int findOnionsDrop(int[] a){
		int diff=0;
		int max=0;
		for(int i=0,j=i+1;i<a.length && j<=a.length-1;j++){
			if(a[i]>a[j]){
				 diff = a[i]-a[j];
				 if(diff>max){
					max=diff;
				 }
			} else{
				i=j;
			}
		}
		System.out.println(max);
		return max;
	}

}
