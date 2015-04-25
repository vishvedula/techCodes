package com.tech.practicePrograms;
	import java.util.HashMap;

public class MapExample {

	   @SuppressWarnings("rawtypes")
	public static void main(String args[]) {
	      // create hash map
	      HashMap newmap = new HashMap();
	      String val = null;
	      
	      // populate hash map
	      newmap.put(1, "tutorials");
	      newmap.put(2, "point");
	      newmap.put(4, "is best");
	      newmap.put(4, "very good");
	      
	      // get value of key 3
	      if(null != newmap.get(4)){
	    	   val=(String)newmap.get(4);
	    	   System.out.println("data : " + val);
	      } else {
	    	  System.out.println("No data found");
	      }
	   }    
	}
