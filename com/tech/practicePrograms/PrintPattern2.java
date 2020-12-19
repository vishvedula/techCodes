/*
print following - 180 degree rotation

        *
      * * 
    * * * 
  * * * * 

*/

public class PrintPattern2 {
   public static void main(String[] args) {
      int n = 8;
      
      printPattern(n);
      
      
   }
   
   static void printPattern(int n){
      
      for(int i=0;i<n;i++)
      {
         int j = n-1; //3
         
         // First fill all blanks in the array
         int k=0;
         
         for(;k < j-i;k++) {
            
            System.out.print(" ");
         }
         
         // For every same iteration fill the other segments with  *
         
         
         for(int l=k;l<=n-1;l++){
            System.out.print("*");
         }
         System.out.print("\n");
       }
      
      
         System.out.print("\n");
         
    }
}
