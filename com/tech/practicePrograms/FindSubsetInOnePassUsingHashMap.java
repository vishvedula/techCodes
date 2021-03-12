/*
Good morning! Here's your coding interview problem for today.
This problem was recently asked by GOOGLE.
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?
Solution I could think of :
This problem is to find if there exists any subset for given number .

- Should happen in 1 pass
- Used HashMap , since insertion order is O(1)
- Leveraged the Input, to find if there exists any difference in array 
- Voila it worked !

*/    
import java.util.*;
    public class FindSumDigit88 {
        public static void main(String args[]){
            int[] a= {10, 4, 3, 2, 6, 5, 9, 7, 12};
            int sum = 15;
        
            findPairs(a, sum);
        }
        
        static void findPairs(int[] a, int sum){

            Map<Integer,Integer> map = new TreeMap<Integer, Integer>();
            int count=0;
            for (int i=0;i<a.length;i++){
                if(map.containsKey(sum-a[i])){
                    System.out.println("The pair is "+ a[i] +" and "+ a[map.get(sum-a[i])]);

                }else{
                    map.put(a[i],count++);
                }
            }

        }
    }
