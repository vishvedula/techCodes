package com.tech.practicePrograms;
import java.util.ArrayList;
import java.util.List;


public class StringToLong {

	public static void main(String args[]) {
		List<Long> aLongList = new ArrayList<Long>();
		
		aLongList.add((long) 18435650);
		aLongList.add((long) 18435650);
		aLongList.add(18435650l);
		aLongList.add(18435650l);
		aLongList.add(18435650l);
		aLongList.add(18435650l);
		aLongList.add(18435650l);
		aLongList.add(18435650l);
		aLongList.add(18435650l);
		
		for(Long aLong : aLongList) {
			System.out.println();
		}
		
	}
}
