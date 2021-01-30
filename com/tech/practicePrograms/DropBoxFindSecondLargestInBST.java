

/*
Dropbox's question of finding the 2nd largest element from a BST
Used java.util.Queue and List to find the 2nd largest element.

Without using List :)
*/


import java.util.Queue;
import java.util.*;
public class DropBoxFindSecondLargestInBST {
   public static void main(String[] args) {
    
      /*
         1
        /  \
       6    61
      / \  / \
     3  19 60 9 
         \   /
         54 59
     */
          
      Node root = new Node(1);
      
      root.left = new Node(6);
      
      root.right = new Node(61);
      
      root.left.left = new Node(3);
      
      root.left.right = new Node(19);
      
      root.right.left = new Node(60);
      
      root.right.right = new Node(9);
      
      root.right.right.left = new Node(59);
      
      root.left.right.right = new Node(54);
      
      
      
      System.out.print("Second largest element is: "+findSecondLargest(root)); // should print 11 (since 1st one is 19)
   }
   
   static int findSecondLargest(Node root){
      
       Queue<Node> queue = new LinkedList<Node>();
      
      int firstMax =root.data;
      int prevFirstMax = root.data;
      
      
       queue.add(root);
       Node currentNode ;
       
        
       while(queue.size()>0){
           currentNode = queue.remove();
           if(currentNode.left!=null){
               queue.add(currentNode.left);
              
              if(currentNode.left.data > firstMax){
                 prevFirstMax = firstMax;
                 firstMax = currentNode.left.data;
              } else if (currentNode.left.data > prevFirstMax){
                 prevFirstMax = currentNode.left.data;
              }
              
               
           }
           
           if(currentNode.right!=null){
               queue.add(currentNode.right);
              
              if(currentNode.right.data > firstMax){
                 prevFirstMax = firstMax;
                 firstMax = currentNode.right.data;
              } else if (currentNode.right.data > prevFirstMax){
                 prevFirstMax = currentNode.right.data;
              }
              
               }
               
           }
          
      System.out.println(prevFirstMax);
      
      return prevFirstMax;
           
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

 
