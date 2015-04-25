package com.tech.practicePrograms;
import java.util.ArrayList;
import java.util.List;
 
public class MyStaticBlock {
 	
	    
	 private static List<String> list;
     
    static{
        //created required instances
        //create ur in-memory objects here
        list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
    }
    
    public void testList(){
        System.out.println(list);
    }
     
    public static void main(String a[]){
        MyStaticBlock msb = new MyStaticBlock();
        List<String> aList = new ArrayList<String>();
        aList.add("1");
        aList.add("2");
        aList.add("3");
        aList.add("4");
        aList.add("5");
        System.out.println(aList);
        msb.testList();
        
    }
}