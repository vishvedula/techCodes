package com.tech.practicePrograms;
import java.util.StringTokenizer;

// To check if any given random sequence is part of the given String
// for ex: to check if "eoa" is part of "alphabet"

// So here we have to check if all the characters are part of the string "alphabet", say "YES" else "NO"

// Used control and branching statements

public class StringSubsequence {

	public static void main(String[] args) {
		try {
			//Reverting changes  to previous branch
			String splitString = "bangalore blr \nHello hel \nhey harvey \nTsunami sun \nbuilding tun";

			StringTokenizer tokenizer = new StringTokenizer(splitString);

			while (tokenizer.hasMoreTokens()) {
				String strNew = tokenizer.nextToken("\n").toString();
				String delim = " ";
				StringTokenizer token = new StringTokenizer(strNew, delim);
				fetchSub(token.nextElement().toString(), token.nextElement().toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static String fetchSub(String str, String str2) {
		char[] charSeq1 = str.toCharArray();
		char[] charSeq2 = str2.toCharArray();
		boolean isPresent = false;

		for (int j = 0; j < str2.length(); j++) { // This contains the shorter string to verify for ex : 's' 'h' 'l'
			for (int i = 0; i < str.length(); i++) { // This contains the actual string 'v' 'i' 's' 'h' 'a' 'l'
				if (String.valueOf(charSeq2[j]).equals(String.valueOf(charSeq1[i]))) {
					isPresent = true;
					break;
				}
			}
			if (isPresent) {
				continue;
			} else {
				break;
			}
		}
		if (isPresent) {
			System.out.println("YES");
			return "YES";
		} else {
			System.out.println("NO");
			return "NO";
		}
	}
}