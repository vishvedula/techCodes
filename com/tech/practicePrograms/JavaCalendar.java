package com.tech.practicePrograms;
import java.util.Calendar;
import java.util.Date;


public class JavaCalendar {

	 public static void main(String args[]) {
		Date d = findTrackingLastDate();
		System.out.println(""+d);
	
	}
		
	
	 static Date findTrackingLastDate() {
			Calendar theCalender = Calendar.getInstance();
			int monthsToDecrement = -6;
			theCalender.add(Calendar.MONTH, monthsToDecrement);
			return theCalender.getTime();

	}
}
