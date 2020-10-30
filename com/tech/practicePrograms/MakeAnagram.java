/**
 * Java program to count the number of characters to be removed to make 2 Strings ANAGRAMS
 * Ex: 
 * 		String str1 = "tuvwxablm";
 * 		String str2 = "abclzvu";
 * 
 * No.of characters to be removed "6" --> t,w,x,m,c,z
 * 
 * results to u,v,a,b,l
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ToMakeAnagrams {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
       System.out.println(numberNeeded(a, b));
	}

	private static int numberNeeded(String str1, String str2) {
		char[] c1 = str1.toCharArray(); 
		char[] c2 = str2.toCharArray();
		List<Character> addList1 = new ArrayList<Character>();

		
		List<Character> list1 = new ArrayList<Character>();
		  for (char c : str1.toCharArray()) {
		        list1.add(c);
		    }

		  List<Character> list2 = new ArrayList<Character>();
		 for (char c : str2.toCharArray()) {
		        list2.add(c);
		    }
		 
		if(Arrays.equals(c1, c2)) {
			System.out.println("Both strings are equal");
		} else{
			for (int i = 0; i<list1.size(); i++) {
				for (int j = 0; j<list2.size(); j++) {
					if (list1.get(i) == list2.get(j)) {
						addList1.add(list1.get(i));
						list1.remove(i);
						list2.remove(j);
						
						j=-1;
						i=0;
					}
				}
			}
		}
		//System.out.println("Finally the left overs String characters are: "+addList1);
		//System.out.println("The number of characters to be removed to make Anagrams :" +(list1.size()+list2.size()));
		return (list1.size()+list2.size());
	}
}
