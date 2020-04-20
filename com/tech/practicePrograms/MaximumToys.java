/**
Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy some.
There are a number of different toys lying in front of him, tagged with their prices. 
Mark has only a certain amount to spend, and he wants to maximize the number of toys he buys with this money.

Given a list of prices  and an amount to spend , what is the maximum number of toys Mark can buy? For example,
if   prices [1,2,3,4] and Mark has to spend k =7, 
he can buy items for , or for units of currency. He would choose the first group of

items.

Function Description

Complete the function maximumToys in the editor below. It should return an integer representing the maximum number of toys Mark can purchase.

maximumToys has the following parameter(s):

    prices: an array of integers representing toy prices
    k: an integer, Mark's budget

Sample Input

7 50
1 12 5 111 200 1000 10

Sample Output

4 --> (1, 5 ,10 , 12)
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaximumToys {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
    int sum =0;
    int count =0;
    int length = prices.length-1;
    //{1 ,5, 10, 12, 111, 200, 1000}; --> 50
    // {1, 2, 3, 4} --> 7
    // 2, 3, 4, 7, 9 --> 15  (2, 3 , 4) , (3, 4 , 7), (2, 3 , 9)
    Arrays.sort(prices);
    
    for(int i=0; i<length; i++){
        if(k > (sum+prices[i])){
            sum+= prices[i];
            count++;
        }
        
    }
   System.out.print(count);
    return count;

    }

    public static void main(String[] args) throws IOException {
       


        int n = 5;

        int k = 15;
        //int[] prices = {1 ,12, 5, 111, 200, 1000, 10};
        int[] prices = {3 ,7, 2, 9, 4};

        int result = maximumToys(prices, k);

       
    }
}
