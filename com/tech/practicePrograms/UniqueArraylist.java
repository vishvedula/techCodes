package com.tech.practicePrograms;
import java.util.ArrayList;
import java.util.List;


 class UniqueArraylist {
 public static void main(String args[]){
			 List<Integer> list = new ArrayList<Integer>();
				list.add(1);
				list.add(2);
				list.add(1);
				list.add(1);
				
		    List<Integer> uniqueList = new ArrayList<Integer>();
		    for (Integer i : list) {
		        if (!inArray(i, uniqueList)) {
		            uniqueList.add(i);
		        }
		    }
		    
		    
		    for(Integer iFinalList : uniqueList) {
		    	System.out.println("" + iFinalList);
		    }
		}
private static boolean inArray(Integer i, List<Integer> list) {
    for (Integer integer : list) {
        if (integer == i) {
            return true;
        }
    }

    return false;
}
}