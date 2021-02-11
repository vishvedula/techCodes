/*
Given a array of numbers representing the stock
prices of a company in chronological order, write
a function that calculates the maximum profit you 
could have made from buying and selling that
stock once. You must buy before you can sell it.
For example, given [9, 11, 8, 5, 7, 10], you should
return 5, since you could buy the stock at 5
dollars and sell it at 10 dollars.
*/

public class FacebookStocks {
   
   public static void main(String args[]){
      int[] ar = {4,11,8,5,7,10};
      
      System.out.print("Max value is: "+findStocks(ar));

   }
   
   private static int findStocks(int[] ar){
       int maxValue = Integer.MIN_VALUE;
       int result=0;
       for(int i=0;i<ar.length;i++){
           for(int j=i+1;j<ar.length;j++){
               if(ar[j]>ar[i]){
                   result = Math.abs(ar[j]-ar[i]);
                   if(result>maxValue){
                       maxValue = result;
                   }
               } else{
                   continue;
               }
           }
       }
       return maxValue;
   }
    
}
