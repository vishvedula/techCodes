
/**
 * Write a function that takes an (unsigned) integer as input, 
 * and returns the number of bits that are equal to one in the binary 
 * representation of that number.

 Example: The binary representation of 1234 is 10011010010, 
 so the function should return 5 in this case

 *
 *
 */
public class BitCountPrint {
	public static void main(String args[]) {
		int x = 4;
		// gives binary representation of a number
		countBits(Integer.toBinaryString(x)); 
		// or we could use the below to get 1's from any binary representation :
		// Integer.bitCount(<number>);
	}

	public static int countBits(String n){
		//gives 10011010010
		int count = 0;
		String[] str1 = n.split("");
		for(int i=0;i<str1.length;i++){
		   if(str1[i].equals("1")){
			   count++;
		   }
		}
		System.out.println(count);
		return count;
		
	}
}


