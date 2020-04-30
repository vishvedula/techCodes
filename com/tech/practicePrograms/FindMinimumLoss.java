/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech_related;

import java.util.*;
import java.lang.*;

/**
 *
 * @author vivedula
 */
public class MiniminumLoss {
    
    public static void main(String []args){
        long[] a = {5,10,3};
        findMinimumLoss(a);
     }
     
    static int findMinimumLoss(long[] price){
      Map<Long,Long> posMap = new HashMap();
        int n = price.length;
        for (int i = 0; i < n; i++) {
            posMap.put(price[i], (long)i); // 5,0   10,1  3,2
        }
        
        long minDiff = Long.MAX_VALUE;
        Arrays.sort(price); // 3, 5 ,10
        
        for (int i = 1; i < n; i++) {
            if ( posMap.get(price[i]) < posMap.get(price[i-1]) ) {
                if (price[i] - price[i-1] < minDiff && price[i] - price[i-1] > 0) {
                    minDiff = price[i] - price[i-1];
                }
            }
            
        }
        
        System.out.print((int)minDiff);
        return (int)minDiff;
       
    }

}
