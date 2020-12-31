/*
Bloomerang company interview question

   20
  /  \
 9   25
/ \
5  12
   / \
  11  14
  
  Inorder --> [5,9,11,12,14,20,25]

Given Binary Tree, we need to return the immediate successor of the given input

For ex: i/p --> 9 , o/p --> 11

        i/p --> 14, o/p --> 20
        
Approach : 
Print the Inorder Traversal of the BST
add the elemens to the list

Then once i/p is provided, write a separate function to return
the next immediate element from the list


*/

import java.util.*;
public class InorderTraversalImmediateSuccesor {
   static List<Integer> list = new ArrayList<>();
   Node root;
   
   InorderTraversal(){
      root = null;
   }
   public static void main(String[] args) {
      Node root = new Node(20);
      root.left = new Node(9);
      root.left.left = new Node(5);
      root.left.right = new Node(12);
      root.left.right.left = new Node(11);
      root.left.right.right = new Node(14);
      root.right = new Node(25);
      
      int k = 12;
      
      printInorderRecursive(root);
      
      
      System.out.println(list);
      
      System.out.println("Found element: "+findImmediateSuccessor(list, k));
      
      
   }
   
   
   static void printInorderRecursive(Node root){
      
      
      if(root == null){
        return; 
      }
      
      if(root.left!=null){
         printInorderRecursive(root.left);
      }
      list.add(root.data);
      System.out.println(root.data);
      
      if(root.right!=null){
         printInorderRecursive(root.right);
      }
      
      
   }
   
   static int findImmediateSuccessor(List<Integer> list, int k){
      
      for(int i=0;i<list.size();i++){
        
         if(list.get(i)==k){
            return list.get(i+1);
         }
      }
      
      System.out.println("Element not found");
      return 0;
   }
}

class Node {
   
   int data;
   Node left;
   Node right;
   
   Node(int data){
      
      this.data = data;
      left = right = null;
   }
   
}
