
//INPUT: Java code to return the keys that occur only Once : 1
// OUTPUT: -1


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurenceAs1 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]){
		List<Integer> list = new ArrayList();
		list.add(0);
		list.add(-1);
		list.add(1);
		list.add(1);
		list.add(0);
		list.add(2);
		list.add(2);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Collections.sort(list); // Sort the values
		
		for(int j=0; j<list.size(); j++){
			map.put(list.get(j), 1);
		}
			
		for(int i=0; i<list.size()-1; i++){
				int counter=1;
				if(list.get(i) != list.get(i+1)){
					continue;
				} else {
					counter++;
				}
				map.put(list.get(i), counter);
			}
		System.out.println("The occurrence of each key is as follows:" + map); 
        
        // The occurrence of each key is as follows:{0=2, 1=2, 2=2, -1=1}
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		
		for(Entry entry: entrySet) {
			if(entry.getValue().equals(1)){
				System.out.println(entry.getKey());
				
			}
		}
	}
}