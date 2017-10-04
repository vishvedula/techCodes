/**
 * accum:
Examples:

Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"

The parameter of accum is a string which includes only letters from a..z and A..Z.
 * @author vivedula
 *
 */
 
 /**
 Shortest way code:
 public class Accumul {
  public static String accum(String s) {
    StringBuilder bldr = new StringBuilder();
    int i = 0;
    for(char c : s.toCharArray()) {
      if(i > 0) bldr.append('-');
      bldr.append(Character.toUpperCase(c));
      for(int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
      i++;
    }
    return bldr.toString();
  }
}
 */
import java.util.Scanner;

public class CodeWarsAccumul {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		accum(scan.next());
	}

	 public static void accum(String s1) {
		 String s = s1.toLowerCase();
		 int length = s.length();
		 char c[] = s.toCharArray();
		 StringBuffer buf = new StringBuffer();
		 
		for (int i = 0; i < length; i++) {
			String str = "";
			int k = 0;
			for (k = 0; k <= i; k++) {
				if (k == 0) {
					str += c[i];
					str = str.toUpperCase();
					buf.append(str);
				} else {
					str ="";
					str+=c[i];
					buf.append(str);
				}
			}
			
			buf.append('-');
		}
			String finalStr = (String) buf.toString();
			System.out.println(finalStr.substring(0, finalStr.length() - 1));
			
	    }
}
