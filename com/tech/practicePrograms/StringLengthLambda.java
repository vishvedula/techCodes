/*
  To find String length using Java LAMBDA expression
*/

@FunctionalInterface
interface StringLengthCal{
   int findStrLength(String str);
   
}

public class Java8StringLength {
   public static void main(String args[]){
     
     StringLengthCal strLength = (str)->{
        if(str.equals("")){
           return 0;
        }else{
           return str.length();
        }
      };
      
      System.out.println("Lambda length = " + strLength.findStrLength("Vishal Vedula"));
     
   }
}
