/*
Morgan Stanley question:
Implement 2 threads in such a way that no duplicates are printed , one executes Odd index and other thread executes Even index

Used Set to remove duplicates, and ran 2 anonymous Threads :) !!
*/

import java.util.*;
public class MorgantStanleyThreads extends Thread{
    private static transient Set<Integer> hashSet = new HashSet<Integer>();
     public static void main(String []args){
        System.out.println("Hello World");
        
        int[] a= {1,2,3,3,5,1,8,8,9};
        
        // I need to have 2 threads and print the non-duplicate numbers
        
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
              for(int i=0;i<a.length;i=i+2){
                  //System.out.println("From first thread "+a[i]);
                if(!hashSet.contains(a[i])){
                    hashSet.add(a[i]);
                    System.out.println("From first thread "+a[i]);

                }
            }  
            }
            
         });
         t1.start();
         

         Thread t2 = new Thread(new Runnable(){
             @Override
             public void run(){
                 for(int j=1;j<a.length;j=j+2){
                //System.out.println("From second thread "+a[j]);
                if(!hashSet.contains(a[j])){
                    hashSet.add(a[j]);
                    System.out.println("From Second thread "+a[j]);
                }
            }
       }
            
         });
         
         t2.start();
         

     }
}
