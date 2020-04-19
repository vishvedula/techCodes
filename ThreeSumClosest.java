/**
 * Given an array of integers, we need to find the closest3sum combination that would sum to the given number
 * Given {-7,9,8,1,1,3, 5,0, -1}
 * Input = -3
 * return [[-7, 1, 3], [-7, 1, 3], [-7, 5, -1]]
 * There could be a better way , since my time complexity is O(n3)
 *
 * ========QUESTION by APPLE=======
 */

import java.util.*;
public class ThreeSumClosest {
  public static void main(String[] args){
      Integer arr[] = {-7,9,8,1,1,3, 5,0, -1};
      int x = -3;
      //Integer arr[] = {5,2,7,6};
      //int x = 13;
      find3SumClosest(arr,x);
  }

  static List<List<Integer>> find3SumClosest(Integer arr[], int x){
      List<Integer> list = new ArrayList<Integer>();
      List<List<Integer>> finalList = new ArrayList<List<Integer>>();
      int n = arr.length-1;
      int sum=0;
      for(int i=0; i<n; i++){
          for(int j=i+1; j<n; j++){
              for(int k=j+1; k<=n ; k++){
                  sum = arr[i]+ arr[j]+arr[k]; // -7,9,8,1,1,3 = -7+9+8 --> 10
                  if(sum == x){
                    list = new ArrayList<Integer>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    finalList.add(list);
                    break;
                }
                sum -= arr[k]; //10-8
              }
              
          }
      }
      //arr = list.toArray(new Integer[0]);
      System.out.print("The array that sum to the given number are --> ");
      System.out.print(finalList);
      return finalList;
  }
}
