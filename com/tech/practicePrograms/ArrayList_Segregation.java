package com.tech.practicePrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArrayList_Segregation {
public static void main(String args[]){
	
	List<Integer> numbers = new ArrayList<Integer>(
	        Arrays.asList(5,3,1)
	    );
	    List<Integer> head = numbers.subList(0, 4);
	    List<Integer> tail = numbers.subList(4, 8);
	    System.out.println(head); // prints "[5, 3, 1, 2]"
	    System.out.println(tail); // prints "[9, 5, 0, 7]"
	    Collections.sort(head);
	    System.out.println(numbers); // prints "[1, 2, 3, 5, 9, 5, 0, 7]"
	    tail.add(-1);
	    System.out.println(numbers); // prints "[1, 2, 3, 5, 9, 5, 0, 7, -1]"
}
}
