
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

	public class WeighUniformString {

	    // Complete the weightedUniformStrings function below.
	    static String[] weightedUniformStrings(String s, int[] queries) {
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		map.put('a', 1);
		map.put('b', 2);
		map.put('c', 3);
		map.put('d', 4);
		map.put('e', 5);
		map.put('f', 6);
		map.put('g', 7);
		map.put('h', 8);
		map.put('i', 9);
		map.put('j', 10);
		map.put('k', 11);
		map.put('l', 12);
		map.put('m', 13);
		map.put('n', 14);
		map.put('o', 15);
		map.put('p', 16);
		map.put('q', 17);
		map.put('r', 18);
		map.put('s', 19);
		map.put('t', 20);
		map.put('u', 21);
		map.put('v', 22);
		map.put('w', 23);
		map.put('x', 24);
		map.put('y', 25);
		map.put('z', 26);
		String[] result = new String[queries.length];
		char[] charArray = s.toCharArray();
		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i < charArray.length; i++) {
			int sum = 0;
			sum = (int) map.get(charArray[i]);
			set.add(sum);
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					sum = sum + (int) map.get(charArray[j]);
					set.add(sum);
					i=j;
				} else {
					break;
				}
			}

		}
		for (int i = 0; i < queries.length; i++) {
			if (set.contains(queries[i])) {

				result[i] = "Yes";

			} else {
				result[i] = "No";
			}
			System.out.println(result[i]);
		}

		return result;

	}

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {

	        String s = scanner.nextLine();

	        int queriesCount = scanner.nextInt();

	        int[] queries = new int[queriesCount];

	        for (int i = 0; i < queriesCount; i++) {
	            int queriesItem = scanner.nextInt();
	            queries[i] = queriesItem;
	        }

	        String[] result = weightedUniformStrings(s, queries);
	        for (int i = 0; i < result.length; i++) {
	            if (i != result.length - 1) {
	            }
	        }
	        scanner.close();
	    }
	}
