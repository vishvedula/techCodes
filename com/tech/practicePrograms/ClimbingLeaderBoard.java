/**
Alice is playing an arcade game and wants to climb to the top of the leaderboard and wants to track her ranking. The game uses Dense Ranking, so its leaderboard works like this:

    The player with the highest score is ranked number 

on the leaderboard.
Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.

7
100 100 50 40 40 20 10
4
5 25 50 120

Sample Output 1

6
4
2
1
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ClimbingLeaderBoard {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] arr, int[] scores) {
         int[] results = new int[scores.length];
        Set<Integer> set = new LinkedHashSet<Integer>();
         for(int i=0;i<arr.length;i++){
             set.add(arr[i]); // 100, 90, 80, 75, 60
            }
            
            int index=0;
            arr = new int[set.size()];
           for(Integer s :set){
               arr[index]=s;
               index++;
           }
        for(int j=0;j<scores.length;j++){
            
            boolean done = false;

            for(int i=0;i<arr.length;i++){
                // Boundary checks first, lower bound

                if(scores[j]<arr[arr.length-1]){
                    results[j] = arr.length+1; 
                    break;
                }

                if(scores[j]>arr[i]){
                   // System.out.println(arr[i]);
                   // System.out.println(scores[j]);
                    results[j] = i+1; //set the rank
                    
                    System.out.println(results[j]);
                    done = true;
                    break;
                } else if(scores[j]==arr[i]){
                    results[j] = i+1; //set the rank
                    
                    System.out.println(results[j]);
                    done = true;
                    break;
                }
                
            
            }
            
            if(!done){
                
                System.out.print(arr.length+" ");
                  results[j] = arr.length+1;  
                  System.out.println(results[j]);
            }
            
        }

        
        return results;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    
      int[] arr = {100, 90, 90, 80, 75, 60};
      int[] scores = {50, 65, 77, 90, 102};

        climbingLeaderboard(arr,scores);
       
    }
}
