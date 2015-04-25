package com.tech.practicePrograms;
import java.util.ArrayList;

import org.springframework.util.StringUtils;


public class SplitListTest {
	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");

		String arraylistToString = StringUtils.collectionToCommaDelimitedString(list);

		System.out.println(arraylistToString);
	}
}
