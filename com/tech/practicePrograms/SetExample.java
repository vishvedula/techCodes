package com.tech.practicePrograms;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

	public class SetExample {

	    @SuppressWarnings("rawtypes")
		public static void main(String[] args) {

	        // Set example with implement TreeSet
	        Set<String> s=new TreeSet<String>();

	        s.add("b");
	        s.add("a");
	        s.add("d");
	        s.add("c");
	        s.add("c");
	        s.add("d");
	        s.add("e");
	        
	        Iterator it=s.iterator();

	        while(it.hasNext())
	        {
	          String value=(String)it.next();

	          System.out.println("Value :"+value);
	        }
	    }
	}
