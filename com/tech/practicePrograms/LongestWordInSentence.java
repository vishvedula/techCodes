/*
 *  
 *  Longest Word


Program to display the longest word in a given sentence.The sentence should be given as an input from the key board by the user. If there are two words of equal length, it displays the first longest word. 

Example:

Input: What is your occupation ?
Output:The longest word in the sentence is occupation



Input:what is your name ?
Output:The longest word in the sentence is what



 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
public class LongestWordGivenStatement {
	
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		 ValueComparator bvc = new ValueComparator(hashMap);
	        TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(bvc);
		try {
			String input = br.readLine();
			//System.out.println("Input: "+ input);
			StringTokenizer token = new StringTokenizer(input);
			int length = token.countTokens();
			while(token.hasMoreTokens()){
				//System.out.println(""+token.nextToken());
				String a[]= new String[length];
				for(int i=0; i<length; i++){
					a[i] = token.nextToken();
					hashMap.put(a[i],a[i].length());
				}
				
				 System.out.println("unsorted map: " + hashMap);
			        sorted_map.putAll(hashMap);
			        System.out.println("results: " + sorted_map);
			        
				
				 final Set<Entry<String, Integer>> mapValues = sorted_map.entrySet();
			        final int maplength = mapValues.size();
			        final Entry<String,Integer>[] test = new Entry[maplength];
			        mapValues.toArray(test);
			        System.out.println(""+test[0].getKey() +"\'is the longest with value being\':"+ test[0].getValue());
				
				
//				System.out.println(""+Arrays.toString(a));
//				System.out.println(""+hashMap.values().size());
//				System.out.println(hashMap.keySet());
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class ValueComparator implements Comparator<String> {
    Map<String, Integer> base;

    public ValueComparator(Map<String, Integer> hashMap) {
        this.base = hashMap;
    }

    // Note: this comparator imposes orderings that are inconsistent with
    // equals.
    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }

}
