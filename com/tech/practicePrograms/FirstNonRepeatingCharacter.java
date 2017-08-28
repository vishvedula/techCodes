import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Given a string, find the first non-repeating character in it. For example, if the input string is 
 * “GeeksforGeeks”, then output should be ‘f’ and if input string is “GeeksQuiz”, then output should be ‘G’.
 * 
 * To find count of each character and filter those characters whose count is 1
 * Then get the index and print the first non-repeating character
 */
public class FirstNonRepeatingCharacter {
	
	public static void main(String args[]){
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int min = Integer.MAX_VALUE; 
		String str = "GeeksaaforGeeks";
		//String str = "GeeksQuiz";
		char[] charArray = str.toCharArray(); 
		int length = charArray.length;
		for(int i=0;i<length; i++){
			int count=0;
			for(int j=0;j<length;j++){
				if(charArray[i]==charArray[j]){
					count++;
				}
				map.put(charArray[i], count);
			}
		}
		Set<Entry<Character, Integer>> entry= map.entrySet();
		map = new HashMap<Character, Integer>();
		for(Entry<Character, Integer> key: entry){
			if(key.getValue() == 1){
				map.put(key.getKey(), str.indexOf(key.getKey()));
			}
		}
		
		List<Character> nonRepeatingCharacter = new ArrayList<>();
		for(Entry<Character, Integer> entry1 : map.entrySet()) {
		    if(entry1.getValue() < min) {
		        min = entry1.getValue();
		        nonRepeatingCharacter.clear();
		    }
		    if(entry1.getValue() == min) {
		        nonRepeatingCharacter.add(entry1.getKey());
		    }
		}
		System.out.println("The String that is the first non-repeating character :"+ nonRepeatingCharacter);
	}

}
