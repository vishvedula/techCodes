package com.tech.practicePrograms;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class RemoveArraylistDup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> aList = new ArrayList();
		aList.add("1");
		aList.add("2");
		aList.add("3");
		aList.add("4");
		aList.add("5");
		aList.add("6");
		aList.add("1");
		aList.add("6");
		aList.add("6");
		aList.add("6");
		aList.add("6");
		
//		Iterator iterator = aList.iterator();
//		Set<String> aSet = new LinkedHashSet();
//		aSet.addAll(aList);
//		aList.clear();
//		
//		System.out.println("" +aSet);
//		aList.addAll(aSet);
//		List<String> uniqueList = new ArrayList();
//		uniqueList.addAll(aSet);
//		System.out.println("" + uniqueList);
		
		// Best and shortest way to Removing duplicates from ArrayList
		Set<String> toRetain = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		toRetain.addAll(aList);
		Set<String> set = new LinkedHashSet<String>(aList);
		set.retainAll(new LinkedHashSet<String>(toRetain));
		aList = new ArrayList<String>(set);
		System.out.println("" + aList);
		
	}

}
