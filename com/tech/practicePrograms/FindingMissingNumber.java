// Input: 1,2,3,4,5,6,8
// Output: 7

import java.util.ArrayList;
import java.util.List;

public class FindingMissingNumber {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(8);
		

		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i + 1) - list.get(i) > 1) {
				System.out.println("Missing number: " + (list.get(i) + 1));
				break;
			} else {
				continue;
			}

		}

	}
}
