 /*
Facebook-interview-questions

Given an array of integers. We have to find the max element of the array, which is at multiple places in the array and return any one of the indices randomly.
Ex: [0,3,2,5,4,5,1,3,5]

print max = 5, and for every function call, we need to print of the 3 indexes that 5 belongs to [3,5,8].

1st time 3, then second time 8 , etc...the index has to be printed randomly

*/

import java.util.Arrays;
public class MaxArrayAndRandomIndex {
	
	public static void main (String args[]) {
		int array[] = {0,3,2,5,4,5,1,3,5};
		int maxIndex = 0;
		int count = 0;
		for(int i= 0;i<array.length;i++){
			if(array[maxIndex] < array[i]){
				maxIndex = i;
				count = 1;
			} else if(array[maxIndex] == array[i]){
			    count++;
		}
	}
		
		int len = array.length;
		int lenSize = 1;
		while( len != 0){
			len = len / 10;
			lenSize = lenSize * 10;
		}
		int r = (int)(Math.random() * lenSize);
		int randomCount = (r%count)+1;
		int j = maxIndex;
		while(randomCount != 0)
			if(array[j++] == array[maxIndex])
				randomCount--;
		System.out.println("The Max Number is " + array[maxIndex] +" and it's random index is " + (j-1));
	}
}
