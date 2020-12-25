
/*
A facebook interview question, where user would be provided with a number ex: 12
output should be the String representation of the same.
Since 12 < 26, we should return
['ab','l]
Input : 312
Output should be only ['cab'] , since 312 > 26
Approach : create a map listing the values 
{1=a, 2=b, 3=c, 4=d, 5=e, 6=f, 7=g, 8=h, 9=i, 10=j, 11=k, 12=l, 13=m, 14=n, 15=o, 16=p, 17=q, 18=r, 19=s, 20=t, 21=u, 22=v, 23=w, 24=x, 25=y, 26=z}
and then do the computation


*/

import java.util.*;
public class FindCombinationOfStringsPart2
{
   
   static Map<Integer,String> map = new HashMap<>();
   static List<String> list = new ArrayList<String>();
   static int k =0;
   
   public static void main(String[] args) {
    
      String str = "1256719";
      
      int i=0;
      
      for(char ch = 'a'; ch  <'z' ; ch++){
          map.put(++i, String.valueOf(ch));
       }
      
         
       System.out.println("count is :"+findDecode(str));
   
}
   
   static int findDecode(String str){
       
      String value = "";
      int length = str.length();
      
      char[] c = str.toCharArray(); // --> ['1','2','3']
      
     
      if(c[0] == '0') { // --> base condition
         System.out.println("count is :"+ 0);
         return 0;
      }
      
       if(c[0] !='0' && length == 1){
         
         //System.out.println("count is :"+ 1);
         value =  map.get(Integer.parseInt(String.valueOf(c[0])));
         list.add(value);
         System.out.println(value);
        
       } else if(c[0] > '0' && c[0] < '2'){
          value =  map.get(Integer.parseInt(String.valueOf(c[0]) + String.valueOf(c[1])));
          System.out.println(value);
          list.add(value);
          findDecode(str.substring(2,length));
          
          
       } else if(c[0] == '2' && c[1] < '6'){
          value =  map.get(Integer.parseInt(String.valueOf(c[0]) + String.valueOf(c[1])));
          System.out.println(value);
          list.add(value);
          findDecode(str.substring(2,length));
          
          
       } else {
          value =  map.get(Integer.parseInt(String.valueOf(c[0])));
          System.out.println(value);
          list.add(value);
          findDecode(str.substring(1,length));                                  
       }
     
      //System.out.println("count is :"+list.size());
      return list.size();
      
   }
   
}
