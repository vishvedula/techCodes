package com.tech.practicePrograms;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class ArrayOfBytesToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
			Calendar theCalender = GregorianCalendar.getInstance();
//			theCalender.add(Calendar.DAY_OF_WEEK, -60);
//			System.out.println(theCalender.getTime());
			
			int theWeekDay = theCalender.get(Calendar.DAY_OF_WEEK);
			theWeekDay = theWeekDay + (7 * 2);
			theCalender.add(Calendar.DAY_OF_WEEK, -theWeekDay);
			System.out.println(theCalender.getTime());
}
}
