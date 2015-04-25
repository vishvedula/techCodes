package com.tech.practicePrograms;
import java.util.ArrayList;
import java.util.List;


public class ArrayListRemove {
public static void main(String args[]) {
	ArrayList<String> arrlist = new ArrayList<String>(5);
	List<String> arraList =  new ArrayList<String>();

    // use add() method to add values in the list
    arrlist.add("G");
    arrlist.add("E");
    arrlist.add("F");
    arrlist.add("M");
    arrlist.add("E");

    System.out.println("Size of list: " + arrlist.size());

    // let us print all the values available in list
    for (String value : arrlist) {
      System.out.println("Value = " + value);
    }  
	
    // Removes first occurrence of "E"
    arrlist.remove("E");
    
    arraList.addAll(arrlist);

    System.out.println("Now, Size of list: " + arrlist.size());
    System.out.println("Now, Size of list: " + arraList.size());
	
    // let us print all the values available in list
    for (String value : arrlist) {
      System.out.println("Value = " + value);
}
}
}
