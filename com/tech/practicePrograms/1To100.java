/*
 * To Print 1-100 without using if loops, recursions etc
 * 
 */

package com.thread.programs;

public class PrintingWithoutOperators {
	
	public static void main(String args[]){
		PrintingWithoutOperators print = new PrintingWithoutOperators();
		print.printTo100();
		
	}

	public void printTo100(){
	    int[] array = new int[101];
	    try{
	        printToArrayLimit(array, 1);
	    }catch(ArrayIndexOutOfBoundsException e){
	    }
	}
	public void printToArrayLimit(int[] array, int index){
	    array[index] = array[index-1]+1;
	    System.out.println(array[index]);
	    printToArrayLimit(array, index+1);
		
	/* easy approach would be as below:
	a[count] = count++;
        System.out.print(a[count-1]+"\n");
        print1To100(a, count);*/
      
   
    }
}
