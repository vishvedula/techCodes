/*
Quora's question of finding the 2nd largest element from a BST

Used java.util.Queue and List to find the 2nd largest element.

*/


import java.util.Queue;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class QuoraFindSecondLargestInBST {
   public static void main(String[] args) {
    
      /*
         1
        /  \
       2    4
      / \  / \
     3  19 6  9 
         \   /
         11 8
     */
          
      Node root = new Node(1);
      
      root.left = new Node(2);
      
      root.right = new Node(4);
      
      root.left.left = new Node(3);
      
      root.left.right = new Node(19);
      
      root.right.left = new Node(60);
      
      root.right.right = new Node(9);
      
      root.right.right.left = new Node(23);
      
      root.left.right.right = new Node(20);
      
      
      
      System.out.print("Second largest element is: "+findSecondLargest(root)); // should print 11 (since 1st one is 19)
   }
   
   static int findSecondLargest(Node root){
      
       Queue<Node> queue = new LinkedList<Node>();
       List<Integer> list = new ArrayList<Integer>();
      
       queue.add(root);
       Node currentNode ;
       
       list.add(root.data);
        
       while(queue.size()>0){
           currentNode = queue.remove();
           if(currentNode.left!=null){
               queue.add(currentNode.left);
               list.add(currentNode.left.data);
               
           }
           
           if(currentNode.right!=null){
               queue.add(currentNode.right);
               list.add(currentNode.right.data);
               }
               
           }
          
      Collections.sort(list); // sort in ascneding order
      int size = list.size();
      System.out.println(list);
      
      return list.get(size-2);
           
    }
     
   }


class Node{
   int data;
   Node left;
   Node right;
   
   Node(int data){
       
      this.data = data;
      left = null;
      right = null;
   }
   
}
