import java.util.*;
import java.io.*;
 
public class BinarySearchRecursive {
     
   public static void main(String args[]) {
      int[] a = {0,1,2,3,4,6,7,9};
      
      Arrays.sort(a); 
      
      int key = 2;
      
      boolean foundKey = findValueBinarySearch(a,key, 0, a.length-1);
      if(foundKey) {
        System.out.print("Found");
      } else {
         System.out.print("Not Found");
      }
      
   }
   
   static boolean findValueBinarySearch(int a[], int k, 
                                        int low, int high){
      
      //int mid = low + ((high-low)/2);
      
      int mid = (low+high)/2;
      
      if(high>=low){
         
         if(k == a[mid]){
            
            return true;
            
         } else if(k>a[mid]){
          
            return findValueBinarySearch(a,k,mid+1, high);
         
         }else if(k<a[mid]){
           
            return findValueBinarySearch(a,k,low, mid-1);
                 
         } else {
            return false;
         }
          
      }
   return false;
   }
  
   
}
