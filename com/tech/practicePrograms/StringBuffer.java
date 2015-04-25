package com.tech.practicePrograms;

public class StringBuffer {
public static void main (String args[]) {
	java.lang.StringBuffer aStringBuffer = new java.lang.StringBuffer();
	aStringBuffer.append("RESELLER");
	aStringBuffer.append(",");
	aStringBuffer.append("TIER 2");
	aStringBuffer.append(",");
	aStringBuffer.append("DISTRIBUTOR");
	aStringBuffer.append(",");
	
	if(aStringBuffer.length() != 0) {
		System.out.println("Not Empty");
		System.out.println(""+aStringBuffer.toString());
	} else {
		System.out.println("Empty");
		System.out.println(""+aStringBuffer.toString());
	}
}
}
