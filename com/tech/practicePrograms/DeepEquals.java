package com.tech.practicePrograms;
import java.util.Arrays;
 
public class DeepEquals {
 
    public static void main(String a[]){
        String[] strArr = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
        String[] strArrCopy = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
        System.out.println("Are strArr and strArrCopy same? "
                    +Arrays.deepEquals(strArr, strArrCopy));
        String[] strArrMod = {"JAVA", "C++", "PERL", "STRUTS"};
        System.out.println("Are strArr and strArrMod same? "
                    +Arrays.deepEquals(strArr, strArrMod));
    }
}
