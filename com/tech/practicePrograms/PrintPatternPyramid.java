/*

To print a PYRAMID of the following form:

         * 
        * * 
       *   * 
      *     * 
     *       * 
    *         * 
   *           * 
  * * * * * * * * 

*/
public class PrintPatternPyramid {
   public static void main(String[] args) {
      int count=1;
      int n=8;
      
      for(int i=0;i<n;i++){
        
         int j=n-i;
         
         int k= 0;
         
         for(;k<=j;k++){
            System.out.print(" ");
         }
         
         //print for starting and ending index only
         if(i!=n-1){ // To print all lines except the last pyramid line
            
            for(j=0;j<=i;j++){
               if(j==0 || j==i){
                  System.out.print("* ");
               } else{
                  System.out.print("  ");

               }
         }
            System.out.println();
         } 
         // This else block is for printing the last line of Pyramid
         else {
            for(j=0;j<=i;j++){
               System.out.print("* ");
            }
            
         }
         
      }
    }
 }
