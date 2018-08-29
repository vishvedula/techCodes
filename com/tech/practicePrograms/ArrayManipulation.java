import java.util.Arrays;
import java.util.Scanner;

/**
 * Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each of the array element 
 * between two given indices, inclusive. Once all operations have been performed, return the maximum value in your array.

For example, the length of your array of zeros . Your list of queries is as follows:

    a b k
    1 5 3
    4 8 7
    6 9 1

Add the values of between the indices and inclusive:

index->	 1 2 3  4  5 6 7 8 9 10
	[0,0,0, 0, 0,0,0,0,0, 0]
	[3,3,3, 3, 3,0,0,0,0, 0]
	[3,3,3,10,10,7,7,7,0, 0]
	[3,3,3,10,10,8,8,8,1, 0]

The largest value is after all operations are performed. 

	5 3
	1 2 100
	2 5 100
	3 4 100
	
	5: size of array starting with index 1
	3: number of iterations
	
	After the first update list will be 100 100 0 0 0.
	After the second update list will be 100 200 100 100 100.
	After the third update list will be 100 200 200 200 100.
	The required answer will be . 


 * @author vivedula
 *
 */
public class ArrayManipulation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Size of array is:");
		int size = scan.nextInt();
		System.out.print("Number of iterations:");
		int iteration = scan.nextInt();
		int arr[] = new int[size+1];
		for (int i = 0; i < iteration; i++) {
				
				int firstInputIndex = scan.nextInt();
				int secondInputIndex = scan.nextInt();
				int value = scan.nextInt();
				
				for(int j=firstInputIndex; j<=secondInputIndex; j++){
					arr[j] += value;
				}
				for(int k=1;k<arr.length;k++)
					System.out.print(arr[k]+ " ");
		}
		
		Arrays.sort(arr);
		System.out.println("\n");
		System.out.println("The max element is :"+ arr[arr.length-1]);
	}

}
