import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Enough is enough!

Alice and Bob were on a holiday. 
Both of them took many pictures of the places they've been, 
and now they want to show Charlie their entire collection. 
However, Charlie doesn't like this sessions, since the motive usually repeats. 
He isn't fond of seeing the Eiffel tower 40 times.
 He tells them that he will only sit during the session if they show the same
  motive at most N times. Luckily, Alice and Bob are able to encode the motive 
  as a number. Can you help them to remove numbers such that their list contains each number only up to N times, without changing the order?
Task

Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering. 
For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times,
 and then take 3, which leads to [1,2,3,1,2,3].
Example

EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]


 * @author vivedula
 *
 */
public class EnoughIsEnough {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {1,1,3,3,7,2,2,2,2};
		//int[] a = {1,1,1,2,1,2,2,1};
		int limit = 3;
		enoughIsEnough(a, limit);

	}

	private static void enoughIsEnough(int[] a, int limit){
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		int count=1;
		for(int i=0; i< a.length; i++){
			if(map.get(a[i])!=null){ // To check if map already has the element
				count = map.get(a[i]); // If so take the existing count
				map.put(a[i], ++count); // Add to map incrementing the count
				if(count > limit){
					// Do Nothing
				}else {
					list.add(a[i]); // Add the necessary elements to the List 
				}
			} else{
				count=1;
				map.put(a[i], count);
				list.add(a[i]);
				
			}
		}
		System.out.println(list); // Finally print the list
	}
}

