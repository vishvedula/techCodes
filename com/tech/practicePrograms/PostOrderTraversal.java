/*

PostOrderTraversal

i/p: 
         20
        /  \
       9    25
      / \
     5   12
        /  \
       11   14
       
 
o/p: <Left><Right><Root>

  5 11 14 12 9 25 20


*/

import java.util.*;



public class PostOrderTraversal {
   
   Node root ;
   
   PostOrderTraversal(){
      root = null;
   }
   public static void main(String[] args) {
      
      Node root  = new Node(20);
      root.left = new Node(9);
      root.right = new Node(25);
      root.left.left = new Node(5);
      root.left.right = new Node(12);
      root.left.right.left = new Node(11);
      root.left.right.right = new Node(14);
      
      printPostOrderTraversal(root);
      
   }
   
   
   static void printPostOrderTraversal(Node root){
      
      if(root==null){
         return ;
      }
      
      if(root.left!=null){
         printPostOrderTraversal(root.left);
      }
      
      if(root.right!=null){
         printPostOrderTraversal(root.right);
      }
      
      System.out.println(root.data);
      
   }
   
}

class Node{
  int data;
   Node left;
   Node right;
   
   Node(int data){
      this.data = data;
      left = right = null;
   }
   
}
