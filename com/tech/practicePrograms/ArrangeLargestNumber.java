/**

Arrange given numbers to form the biggest number | Set 1

Given an array of numbers, arrange them in a way that yields the largest value. For example, if the given numbers are {54, 546, 548, 60}, 
the arrangement 6054854654 gives the largest value. And if the given numbers are {1, 34, 3, 98, 9, 76, 45, 4}, then the arrangement 998764543431 gives the largest value.
*/

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;


public class LargestNumber {

	 static void printLargest(final Vector<String> arr){
	     
	        Collections.sort(arr, new Comparator<String>(){
	 
	        // A comparison function which is used by 
	        // sort() in printLargest()
	        @Override
	        public int compare(String X, String Y) {
	        // System.out.println(arr);
	        // first append Y at the end of X
	        String XY=X + Y;
	         
	        // then append X at the end of Y
	        String YX=Y + X;
	         
	        // Now see which of the two formed numbers 
	        // is greater
	        return XY.compareTo(YX) > 0 ? -1:1;
	    }
	    });
	         
	    Iterator it = arr.iterator();
	 
	    while(it.hasNext())
	        System.out.print(it.next());
	     
	    }
	     
	    // driver program
	    public static void main (String[] args) {
	         
	        Vector<String> arr;
	        arr = new Vector<>();
	         
	        //output should be 6054854654
	        arr.add("54");
	        arr.add("546");
	        arr.add("548");
	        arr.add("60");
	        
	      /*  arr.add("23");
	        arr.add("43");
	        arr.add("100");
	        arr.add("9");*/
	        printLargest(arr);
	    }
}