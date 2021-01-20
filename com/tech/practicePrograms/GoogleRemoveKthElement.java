/*

This problem was asked by Google.
Given a singly linked list and an integer k, remove the k last element from the list. k is guaranteed
to be smaller than the length of the list.
The list is very long, so making more than one pass is prohibitively expensive.
Do this in constant space and in one pass.

*/
import java.util.*;
public class GoogleRemoveKthElement {
   
   static Node head;
     
   public static void main(String args[]){
      
      Node root = new Node(100);
      root.next = new Node(200);
      root.next.next = new Node(300);
      root.next.next.next = new Node(400);
      root.next.next.next.next = new Node(500);
      
      removeKthElement(root,2); // remove 2nd last element : 3
              
      
   }
   
   static void removeKthElement(Node root, int k){
       
      Node slow = root, fast = root; // Have fast and slow pointers
      
      for(int i=0;i<k+1;i++){
         fast = fast.next;
      }

      while(fast!=null){
         slow= slow.next;
         fast=fast.next;
      }
      
      slow.next= slow.next.next;
      
     
      
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
 
