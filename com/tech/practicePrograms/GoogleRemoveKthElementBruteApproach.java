/*

This problem was asked by Google.
Given a singly linked list and an integer k, remove the k last element from the list. k is guaranteed
to be smaller than the length of the list.
The list is very long, so making more than one pass is prohibitively expensive.
Do this in constant space and in one pass.


*/
import java.util.*;
public class GoogleRemoveKthElementBruteApproach {
   
   static Node head;
     
   public static void main(String args[]){
      
      Node root = new Node(100);
      root.next = new Node(200);
      root.next.next = new Node(300);
      root.next.next.next = new Node(400);
      root.next.next.next.next = new Node(500);
      
      removeKthElement(root,1); // remove 2nd last element : 3
              
      
   }
   
   static void removeKthElement(Node root, int k){
      
      // length = 4; k = 2; result = 4-1 = 3rd element
      // length = 5; k = 4; result = 5-3 = 2nd element
      Map<Integer, Integer> map = new HashMap<>();
      int count = 1;
      int result = 0;
      int i = 1;
      int nodeRemoved = 0;
      head = root;
      
      if(root==null){
         return;
      }
      
      while(null != root){
         map.put(count++,root.data);
        
         root = root.next;
      }
      
      System.out.println(map);
      
      result = map.size()-k+1;
      nodeRemoved = map.get(result);
      System.out.println("Node to be removed: "+nodeRemoved);
      
      while(null!=head){
         if(result == ++i){
            //System.out.print(" "+head.data);
            head.next = head.next.next;
            
         } else{
            System.out.print(head.data + " ");
            head = head.next;
            
         }
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
 
