
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * Given input :
 * 
 * wOrLD
 * 
 * Expected ouput:
 * 
 * WoRld
 */
public class ChangeCaseOfWords {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String input = br.readLine();
			System.out.println("The Input is :" + input);
			char[] a = new char[input.length()];
			for (int i = 0; i < input.length(); i++) {
				a[i] = input.charAt(i);
				if (Character.isLowerCase(a[i])) {
					a[i] = Character.toUpperCase(a[i]);

				} else {
					a[i] = Character.toLowerCase(a[i]);

				}
			}
			String output = new String(a);
			System.out.println("The output is: " + output);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
