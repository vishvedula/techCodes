/*
print following - 180 degree rotation
        *
      * * 
    * * * 
  * * * * 
  
  If we leverage the same code, and print "* ", * with space, then we would get a Christmas Tree :)
        *
      *   * 
    *   *   * 
  *   *   *    *
  
*/

public class PrintChristmasTreePattern {
   public static void main(String[] args) {
      int n = 5;
      
      printPattern(n);
      
      
   }
   
   static void printPattern(int n){
      
      for(int i=0;i<n;i++)
      {
         int j = n-1; 
         
         // First fill all blanks in the array
         int k=0;
         
         for(;k < j-i;k++) {
            
            System.out.print(" ");
         }
         
         // For every same iteration fill the other segments with  *
         
         
         for(int l=k;l<=n-1;l++){
           // System.out.print("*"); // Code for 180* rotation
           System.out.print("* "); // Give ("* ")with space to print a Christmas Tree :)
         }
         System.out.print("\n");
       }
      
         System.out.print("\n");
         
    }
}
