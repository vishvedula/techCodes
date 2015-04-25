package com.tech.practicePrograms;
import java.util.StringTokenizer;

public class StringTokenizerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String splitString = "bangalore blr \nHello hel \nhey harvey \nTsunami sun \nbuilding gun";

		StringTokenizer tokenizer = new StringTokenizer(splitString);
		// StringTokenizer tokenizer2 = new StringTokenizer(str)

		while (tokenizer.hasMoreTokens()) {
			String strNew = tokenizer.nextToken("\n").toString();
			String delim = " ";
			StringTokenizer token = new StringTokenizer(strNew, delim);
			while(token.hasMoreElements()) {
				System.out.println(""+token.nextElement());
			}
		}

	}
}
