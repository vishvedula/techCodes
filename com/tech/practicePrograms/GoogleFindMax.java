import java.lang.*;
/*
For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, 
we should get: [10, 7, 8, 8], since:

    10 = max(10, 5, 2)
    7 = max(5, 2, 7)
    8 = max(2, 7, 8)
    8 = max(7, 8, 7)
    
    Do this in O(n) time and O(k) space.
    You can modify the input array in-place and 
    you do not need to store the results. 
    You can simply print them out as you compute them.

*/
public class GoogleFindMax {
   public static void main(String[] args) {
      
      int k=5;
      int[] a = {10,5,2,7,8,7};
      
      findMax(a,k);
      
   }
   
   static void findMax(int[] a, int x){
      int m=0;
     for(int i=0, j=i+1;i<a.length && j<a.length-1;i++,j++)
      {
        int k =x;
        int currentMax=0;
        int finalMax = 0;
        m=i;
        
        // for k=3, we need to find 2 max values
        // for k = 4, we need to find 3 max values
        // i.e k-1 max values
       
        while(k-1>0 && m<a.length-1){
         
         currentMax = Math.max(a[m],a[m+1]);
         if(currentMax>finalMax)
            finalMax= currentMax;
         //max2 = Math.max(a[j],a[j+1]);
         k--;
         m++;
        }
        System.out.println(finalMax);
      }
      
      
   }
}
