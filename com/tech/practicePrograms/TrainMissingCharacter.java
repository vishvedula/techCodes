
/**
 * #Find the missing letter

Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.

Example:

['a','b','c','d','f'] -> 'e'
['O','Q','R','S'] -> 'P'

 * @author vivedula
 *
 */
public class TrainMissingCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] array = {'O','Q','R','S'};
		//char[] charArray = {'a','b','c','d','f'};
		findMissingLetter(array);
	}
	
	public static char findMissingLetter(char[] array){
		int diff =0;
		char c =' ';
		for(int i =0;i<array.length; i++){
			int ascii = (int) array[i];
			int ascii1 = (int) array[i+1];
			 diff = ascii1 - ascii;
			if(diff > 1) {
				c = (char)(ascii1-1);
			System.out.println("missing character is: " + (char)(ascii1-1));
			break;
			}
		}
		return c;
	}

}
