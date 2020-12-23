/*
A facebook interview quesiton, where user would be provided with a number ex: 12

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
public class findCombinationOfStrings
{
    public static void main(String[] args)
    {
       int data = 312;
       Map<Integer,Character> map = new HashMap<Integer,Character>();
     
          char[] alphabet = new char[26]; // new array
          int i=0;
               
           for(char ch = 'a'; ch <= 'z'; ch++)// fills alphabet array with the alphabet
           {
               alphabet[ch-'a']=ch; // No using for now
               
              map.put(++i,ch);
           } 
               
            // System.out.print(alphabet);// output
             System.out.println(map);// output
       
       findOutput(data,map);
    }
   
   static void findOutput(int data, Map map){
      
      List<String> list = new ArrayList<>();
      
      String finalStr = "";
      
      String str = String.valueOf(data);
      
      char[] array = str.toCharArray();
      
      int n = array.length;
      
      if(data < 26){
         char c = (char) map.get(data);
         list.add(String.valueOf(c));
      }
      
      
      for(int i=0;i<n;i++){
         char c = (char) map.get(Integer.parseInt(String.valueOf(array[i])));
         finalStr = finalStr+String.valueOf(c);
       }
      
      System.out.println(finalStr);
      
      list.add(finalStr);

      System.out.println(list);
      }
   
}
