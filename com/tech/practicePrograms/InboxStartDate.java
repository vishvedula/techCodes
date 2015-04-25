package com.tech.practicePrograms;
import java.util.Calendar;
import java.util.TimeZone;


public class InboxStartDate {
public static void main(String args[]) {
//	Calendar theCalender = GregorianCalendar.getInstance();
//	int theWeekDay = theCalender.get(Calendar.DAY_OF_WEEK);
//	//theCalender.add(Calendar.DAY_OF_WEEK, -theWeekDay + 1);
//	
//	theCalender.add(Calendar.DAY_OF_WEEK, -theWeekDay);
//	System.out.println(theCalender.getTime());
	
    Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
    int currentDayOfWeek = localCalendar.get(Calendar.DAY_OF_WEEK);
    System.out.println("Current Day of Week: " + currentDayOfWeek);
    System.out.println(localCalendar.getTime());

}
}
