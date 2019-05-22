import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class GregorianCalendar {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        String[] dayofweek = { "Invalid", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" }; 
        int[] darr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 
  
        // check validity of year and month 
        if (year > 0 && (month > 0 && month <= 12)) { 
  
            // check for a leap year and month of February 
  
            if ((year % 4 == 0 || year % 400 == 0) &&  
                month == 2 && (day > 0 && day <= 29)) { 
  
                // month starts at zero, so we need to put ( month - 1 ). 
                Calendar calendar = new GregorianCalendar(year, month - 1, day); 
                return dayofweek[calendar.get(Calendar.DAY_OF_WEEK)]; 
            } 
            else { 
  
                // check the range of day of month 
                if (day > 0 && day <= darr[month - 1]) { 
  
                    // month starts at zero, so we need to put ( month - 1 ). 
                    Calendar calendar = new GregorianCalendar(year, month - 1, day); 
                    return dayofweek[calendar.get(Calendar.DAY_OF_WEEK)]; 
                } 
               // else
                    //return 0; 
            } 
        } 
        //else
            return "Invalid"; 
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
