/*Move Zeros To End

Given a static-sized array of integers arr, move all zeroes in the array to the end of the array. You should preserve the relative order of items in the array.

We should implement a solution that is more efficient than a naive brute force.

Examples:

input:  arr = [1, 10, 0, 2, 8, 3, 0, 0, 6, 4, 0, 5, 7, 0]
output: [1, 10, 2, 8, 3, 6, 4, 5, 7, 0, 0, 0, 0, 0]

Constraints:

    [time limit] 5000ms
    [input] array.integer arr
        0 ≤ arr.length ≤ 20
    [output] array.integer
*/

import java.io.*;
import java.util.*;

class MoveZeroesToEnd {

	static int[] moveZerosToEnd(int[] arr) {
		int count=0;
      for(int i=0;i<arr.length;i++){
         if(arr[i]!=0){
           arr[count++]=arr[i]; 
         }
         
      }
      
      while(count != arr.length) {
          arr[count++]=0;
          
      }
      System.out.print(Arrays.toString(arr));
    return arr;
    
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
  int[] arr = new int[20];
    for(int i=0;i<arr.length;i++){
      arr[i] = scan.nextInt();
    }
    
    moveZerosToEnd(arr);
	}
}
