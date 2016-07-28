import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayReverse {

	public static void main(String args[]){
		System.out.println("Enter number of integers for reversing");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String range = br.readLine();
			int size = Integer.parseInt(range);
			int array[] = new int[Integer.parseInt(range)];
			
			for(int i=0; i <array.length; i++){
				array[i]= Integer.parseInt(br.readLine());
			}
			// to print in reverse order
			for (int j = size-1; j >= 0; j--) {
				System.out.println("" + array[j]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
