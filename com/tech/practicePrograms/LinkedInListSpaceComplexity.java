/*
This problem was asked by LinkedIn.
Given a linked list of numbers and a pivot k, 
partition the linked list so that all nodes less than k come before nodes greater than or equal to k.
For example, given the linked list 5 -> 1 -> 8 -> 0 -> 3 and k = 3, 
the solution could be 1 -> 0 -> 5 -> 8 -> 3.

Solved with O(1) Space complexity, unlike previous code where 
I used 2 arrayLists
*/    

public class LinkedInList{
   public static void main(String args[]){
      Node root = new Node(5);
      root.next = new Node(1);
      root.next.next = new Node(8);
      root.next.next.next = new Node(0);
      root.next.next.next.next = new Node(3);
      
      int pivot = 3;
      
      prepareList(root, pivot);
   }
   
   static void prepareList(Node root, int k){
       
          Node currentNode = root.next;
             
          while(null != root && null != currentNode){
           if(root.data > currentNode.data && currentNode.data <= k) {
                   
                // swap elements
                   int temp = root.data;
                   root.data = currentNode.data;
                   currentNode.data = temp;
                   System.out.println(root.data);
                   root = root.next;
                   currentNode = root.next;
               } else {
                  currentNode = root.next.next;
               }
             } 
         
         System.out.println(root.data);
         
          if(null != root.next){
            System.out.println(root.next.data);
          }
          
       }
       
   }

class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        next = null;
    }
   
}
