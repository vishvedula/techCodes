/**
There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings.

For example, given input and , we find instances of ', of '' and of ''. For each query, we add an element to our return array, . 
**/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SparseArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] queries = {"de","lmn","fgh"};
		String[] input = {"def","de","fgh"};
		
		validateSparseArrays(input,queries);

	}
	
	private static int[] validateSparseArrays(String[] input, String[] queries){
		List countList = new ArrayList<Integer>();
		for(int i=0; i< queries.length; i++){
			int counter =0;
			for(int j=0; j<input.length; j++){
				if(queries[i].equals(input[j])){
					counter++;
				} 
			}
			if(counter==0){
				countList.add(0);
			} else{
				countList.add(counter);
			}
		}
		int[] counterArray = new int[countList.size()];
		for(int i=0;i<counterArray.length;i++){
			counterArray[i] = (int) countList.get(i);
		}
		return counterArray;
	}

}
