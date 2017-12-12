import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.

Examples:

Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.  
Only subsequence "abc" is reversed

Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"

 * @author vivedula
 *
 */
public class ReverseArrayWithoutSpecialCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Note: Since input is string , we should have used Pattern Matcher for computing the same
		
		//char[] c1 = {'a',',','z','#','x', 'y'}; // --> ['y', ',', 'x','#','z','a']
		
		char[] c1 = {'A','b',',','c',',','d','e','!','$'}; //Ab,c,de!$ --> "ed,c,bA!$"
		
		Map<Integer, Character> mapArray = new HashMap<>();
		for(int i=0; i < c1.length; i++){
			int ascii = (int)c1[i];
			if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122))
			{
				mapArray.put(i, c1[i]);
				//System.out.println("Its a normal character: "+ c1[i]);
			}
		}
		
		char[] c2 = new char[mapArray.size()];
		int length = c2.length;
		char[] temp = new char[length];
		int i=0;
		
		System.out.println("Before swapping"+ mapArray);
		for(Integer key : mapArray.keySet()){
				c2[i] = mapArray.get(key);
				i++;
			}
		
		for(int j=0,  count= (length)/2, k = length-1;j<length-1 && count!=0; j++, k--){
			temp[j] = c2[j];
			c2[j] = c2[k];
			c2[k] = temp[j];
			count--;
		}
		

		System.out.println("After swapping but prior to insertion into main array: ");
		System.out.println(c2);
		
		int l=0;
		while (length-1 != 0) {
			for (Integer key : mapArray.keySet()) {
				mapArray.put(key, c2[l]);
				c1[key] = mapArray.get(key);
				length--;
				l++;
			}
			break;
		}
		System.out.println(mapArray);
		System.out.println(c1);
	}

}
