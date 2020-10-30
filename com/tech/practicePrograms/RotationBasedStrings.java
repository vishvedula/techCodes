
package com.thread.programs;

/*
 * To check if given 2 strings are ROTATION based of each other
 * Input1: waterbottle
 * Input2 : erbottlewat
 * Output: YES
 * 
 * Input1: waterbottle
 * Input2 : erbottlewae
 * Output: NO
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotationBasedStrings {

	public static void main(String args[]) {
		String str = "waterbottle";
		String str2 = "erbottlewat";
		List<Character> list = new ArrayList<>();
		List<Character> newList = new ArrayList<>();

		char[] characterArray = str.toCharArray();
		char[] characterArray2 = str2.toCharArray();

		if (str.length() == str2.length()) {
			for (int i = 0; i < characterArray.length; i++) {
				list.add(characterArray[i]);
			}
			for (int i = 0; i < characterArray2.length; i++) {
				newList.add(characterArray2[i]);
			}

			Collections.sort(list);
			Collections.sort(newList);

			System.out.println(list);
			System.out.println(newList);

			if (newList.equals(list)) {
				System.out.println("Yes they are Rotation");
			} else {
				System.out.println("No they are NOT rotation based");
			}
			
		} else {
			System.out.println("String lengths mismatch");
		}
	}

}
