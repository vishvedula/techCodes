/**
 * Given an array of numbers return true if you find a triplet that adds to zero, false otherwise. Try to provide an algorithm with less than O(n^3) complexity.

Example-1: A = [5, -2, 4, 8, -3, 7] returns true since 5 + -2 + -3 = 0

Example-2: A = [5, 16, -2, -5, 39, 23] returns false as we cannot find three numbers that add to zero
 */
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class FindTriplet {
    public static void main(String args[] ) throws Exception {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str= br.readLine().split(",");               // Reading input from STDIN
        int[] a = new int[str.length];
			for(int i=0;i<str.length; i++){
				a[i]=Integer.parseInt(str[i]);
            }
       findTriplet(a);
    }
    
    private static boolean findTriplet(int[] a){
        Arrays.sort(a);
        int[] temp = new int[a.length];
        int negSum=0;
        boolean found = false;
        for(int i=0;i<a.length;i++){
        	if(a[i]<0){
        		temp[i] = a[i];
        		negSum+=temp[i];
        		a[i]=0;
        	}
        }
        
        for(int j=0;j<a.length;j++){
        	if(a[j]+negSum==0){
        		found = true;
        		System.out.println("true");
        		return found;
        	} else {
        		continue;
        	}
        	
        }
        System.out.println("false");
        return false;
    }
}
