package com.tech.practicePrograms;
import java.util.*;
public class StringReverseScanner {
	
	    public static void main(String[] args) {
	        // Write your code here
	        Scanner scan = new Scanner(System.in);
	        int num = scan.nextInt();
	        for (int i= 0; i < num ; i++) {
	        String str = scan.next();
		    System.out.println(reverse(str));
	        }
	    }
	    
	    private static String reverse(String str) {
	        StringBuffer strBuf = new StringBuffer(str);
	        str = strBuf.reverse().toString(); 
			return str;
	    }
	}


