/*
This problem was asked by Google.
Given an array of strictly the characters 'R', 'G', and 'B', 
segregate the values of the array so that all
the Rs come first, the Gs come second, 
and the Bs come last. You can only swap elements of the
array.
Do this in linear time and in-place.
For example, 
given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'], 
it should become ['R', 'R', 'R', 'G', 'G', 'B', 'B'].

*/
public class GoogleReplaceRGB {
   public static void main(String[] args) {
      
     // char[] cArray = {'G','B','R','G','B'};
      
      char[] cArray = {'G', 'B', 'R', 'R', 'B', 'R', 'G','R','B','G','G','R'};
      
      fixArray(cArray);
      
   }
   
   static char[] fixArray(char[] cArray){
      int n = cArray.length;
      
      for(int i=0,j=n-1;i!=n-1;){
         if(cArray[i]!='R'){
            if(i==j){ // To increment the ith element till end
               i=i+1;
               j=n-1;
            }
            if((int)cArray[i]-'0' < (int)cArray[j]-'0'){
               //swap elements
               char temp = cArray[i];
               cArray[i]=cArray[j];
               cArray[j]=temp;
               
            } else{
               j--;
               
            }
            
         } else{
            i++; // if ith element is already 'R', move on
         }
      }
      
      return cArray;
   }
}
