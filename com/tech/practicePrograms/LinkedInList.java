/*
This problem was asked by LinkedIn.

Given a linked list of numbers and a pivot k, 
partition the linked list so that all nodes less than k come before nodes greater than or equal to k.

For example, given the linked list 5 -> 1 -> 8 -> 0 -> 3 and k = 3, 
the solution could be 1 -> 0 -> 5 -> 8 -> 3.
*/    


import java.util.*;
public class LinkedInList {
   static int pivot = 3;
   public static void main(String[] args) {

   // Scanner scan = new Scanner(System.in);
    

    Node root = new Node(5);
    root.next = new Node(1);
    root.next.next = new Node(8);
    root.next.next.next = new Node(0);
    root.next.next.next.next = new Node(3);

    arrangeLinkedList(root, pivot);
      System.out.print(" "+pivot);
      
   }

   static void arrangeLinkedList(Node root, int pivot){
    List<Integer> small = new ArrayList<Integer>();
    List<Integer> large = new ArrayList<Integer>();
    while(null != root) {
         if(root.data < pivot){
            small.add(root.data);
         } else if(root.data > pivot){
            large.add(root.data);
            }

        root = root.next;
   }
      
      //Collections.reverse(small);
      //Collections.reverse(large);
      
      // Now prepare the linkedList again beginning 
      //from small list , to large list , appended by the pivot at last
      
      push(small, root);
      push(large, root);
      
      
}
   
   static void push(List<Integer> list, Node root) {
      for(int i=0;i<list.size();i++){
         
         if(root == null){
            root = new Node(list.get(i));
            System.out.print(" "+root.data);
            root.next = null;
         } else{
            Node currentNode = new Node(list.get(i));
            root.next = currentNode;
             System.out.print(" "+currentNode.data);
            currentNode = root;
         }
      }
      
      
   }
}

class Node {
    int data;
    Node next;

    Node (int data){
        this.data = data;
        next = null;
    }
}
