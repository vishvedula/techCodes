/**
 * Input:

Given a string and number of rows ‘n’. 
Print the string formed by concatenating n rows when input string is written in row-wise Zig-Zag fashion.

Examples:

Input: str = "ABCDEFGH"
       n = 2
Output: "ACEGBDFH"
Explanation: Let us write input string in Zig-Zag fashion
             in 2 rows.
A   C   E   G   
  B   D   F   H
Now concatenate the two rows and ignore spaces 
in every row. We get "ACEGBDFH"

Input: str = "GEEKSFORGEEKS"
       n = 3
Output: GSGSEKFREKEOE
Explanation: Let us write input string in Zig-Zag fashion
             in 3 rows.
G       S       G       S
  E   K   F   R   E   K
    E       O       E
Now concatenate the two rows and ignore spaces 
in every row. We get "GSGSEKFREKEOE"
 * @author vivedula
 *
 */
import java.util.Scanner;
public class ConcatenationOfZigZag {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = input.next();
		int l = str.length();
		System.out.println("Enter the zigzag limit");
		int m = input.nextInt();
		
		char[][] array = new char[m][l];
		
		printZigZag(array, l,m,str);
	}
	
	private static void printZigZag(char[][] array, int l, int m, String str){
		int i=0,j=0;
		while(l!=0){
			if(m>0){
			array[i][j] = str.charAt(j);
			System.out.print(array[i][j]);
			i++; 
			} else if(m==0){
				i=array.length-2; // i's value would change once m==0
				array[i][j] = str.charAt(j);
				System.out.print(array[i][j]);
			} else if(m<0 && i==0){ // for i==0, we need to toggle down
				++i;
				array[i][j] = str.charAt(j);
				System.out.print(array[i][j]);
			}else { // for i!=0 we still need to toggle up
				--i;
				array[i][j] = str.charAt(j);
				System.out.print(array[i][j]);
			}
			j++;
			m--;
			l--;
			
		}
		System.out.println();
		for(int k=0;k<array.length;k++){
			for(int x=0;x<str.length();x++){
				if(Character.isAlphabetic(array[k][x])){
					System.out.print(array[k][x]);
				}
			}
		}
	}

}
