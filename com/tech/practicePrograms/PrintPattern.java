/*
Print following pattern:

            *
            **
            ***
            ****
            *****
*/

import java.util.Arrays;
public class PrintPatterns {
   public static void main(String[] args) {
      int n = 5;
      String[][] a= new String[n][n];
      printPatterns(n, a);
      
   }
   
   static void printPatterns(int n, String[][] a){
    
      for(int i=0 ;i<n;i++){
         
         for(int j=0;j<=i;j++){
            a[i][j] = "*";
            
            System.out.print(a[i][j]);
         }
         
         System.out.println("");
         
      }
       
   }
}
