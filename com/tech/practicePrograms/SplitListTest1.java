package com.tech.practicePrograms;
import java.util.ArrayList;
import java.util.List;

public class SplitListTest1 {
	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		List<String> aList2 = new ArrayList<String>();
		String delimiter = ",";
		list.add("one");
		list.add("two");
//		list.add("three");
//		StringBuilder sb = new StringBuilder();  
//		  for (Object e : list) {  
//		    sb.append(e);
//		    sb.append(delimiter);
//		  }  
//		  sb.deleteCharAt(sb.length()-1);
//		  System.out.println(""+sb.toString());  
//		}  
		
		for(String a : list){
			aList2.add(a);
			
		}
		list2.addAll(aList2);
		System.out.println(""+list2.toString());
	}
}
