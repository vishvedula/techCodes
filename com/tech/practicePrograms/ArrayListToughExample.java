
/*
 * Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number 
located in  position of  line. 

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there 
will be  space-separated integers.
 In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints:

Each number will fit in signed integer.
Total number of integers in  lines will not cross 100000.

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

REQUESTED:
Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample Output

74
52
37
ERROR!
ERROR!

ACHIEVED:
Input:
5
2 3 5
6 1 4 2 5 4 3 6
3 5 4 2 6
1 4
6 1 4 2 5 6 7 8 
1 5
{0=[3, 5], 1=[1, 4, 2, 5, 4, 3], 2=[3, 5, 4, 2, 6, 1], 3=[6, 1, 4, 2], 4=[6, 7, 8, 1, 5]}
1
3
2
3
4

Output:
SAMPLE OUTPUT:[5, 5, 4, 2, 5]


 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class ArrayListComplexComputation {
	
	@SuppressWarnings("resource")
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	List<Integer> list = null;
	List<Integer> finalList = new ArrayList<Integer>();
	Map<Integer, List<Integer>> hashMap =  new HashMap<Integer, List<Integer>>();
		try {
			int numberOfTestcases = sc.nextInt();
			
			for(int i=0; i<numberOfTestcases; i++) // Ex: 2 testcases
			{
				list = new ArrayList<Integer>();
				int length = sc.nextInt();
				for(int j=0;j<length; j++)
				{
					
					list.add(sc.nextInt());
					
				}

				hashMap.put(i, list);
			}
			
				System.out.println("SAMPLE INPUT:"+hashMap);
			
			for(int j=0; j<numberOfTestcases; j++)
			{
				// First we need to get the values from hashMap for the given Kth index
				Set<Entry<Integer, List<Integer>>> aSet = hashMap.entrySet();
				Iterator<Map.Entry<Integer, List<Integer>>> iterator = aSet.iterator();
				while(iterator.hasNext())
				{
					Entry<Integer, List<Integer>> entry = iterator.next();
					int findIndexedElement = Integer.parseInt(br.readLine());
					List<Integer> midList = entry.getValue();
					finalList.add(midList.get(findIndexedElement));
				}
				System.out.println("SAMPLE OUTPUT:" +finalList);
				break;
				
			}
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
