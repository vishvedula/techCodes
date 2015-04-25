package com.tech.practicePrograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayListSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> aList = new ArrayList<String>();
		aList.add("1");
		aList.add("2");
		aList.add("5");
		aList.add("4");
		aList.add("3");
		aList.add("6");
		Collections.sort(aList);
		System.out.println(""+aList);
	}

}
