import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseWords {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		StringTokenizer token = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int limit = scan.nextInt();
		try {
			
			for (int i = 0; i < limit; i++) {
				token = new StringTokenizer(br.readLine());
				//reverseWords(br.readLine());
				reverseWords(token);
				}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private static void reverseWords(StringTokenizer str) {
		String reversed = "";
		while(str.hasMoreElements()){
			  reversed =  str.nextToken() + ' ' + reversed; //add to start
			
		}
		 System.out.println(reversed.trim());
	}
	

}
