import java.util.*;
public class AmazonLength {
   public static void main(String[] args) {
      
      String str = "Vishal Vedula";
      int breakPoint = 13;
      findList(str,breakPoint);
      
   }
   
   
   static List<String> findList(String str, int breakPoint){
      List<String> list = new ArrayList<>();

      List<String> tempList = new ArrayList<>();

      StringBuilder builder = null;
      StringTokenizer tokens = new StringTokenizer(str," ");

      while(tokens.hasMoreTokens()){
         tempList.add(tokens.nextToken());
      }
      
      for(String word: tempList){ // Actual Biz logic
         if(breakPoint < word.length()){
            System.out.println("Not a valid scenario");
            return null;
         } else if(builder == null){
            builder = new StringBuilder(word);
         } else if(builder.length() + word.length() + 1 <=breakPoint){
            builder.append(" ").append(word);
         } else{
            list.add(builder.toString());
            builder = new StringBuilder(word);
         }
      }

      if(builder!=null){
         list.add(builder.toString());
      }
      return list;
   }
}