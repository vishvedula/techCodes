import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        Boolean b1,b2;
        BigInteger bi1;

      // assign values to bi1
      bi1 = new BigInteger(n);

      // perform isProbablePrime on bi1
      b1 = bi1.isProbablePrime(1); // certainity of 1 --> true
      b2 = bi1.isProbablePrime(-1); // certainity of -1 --> also true
      if(b1 && b2) {
          System.out.print("prime");
      } else {
           System.out.print("not prime");

      }
        scanner.close();
    }
}
