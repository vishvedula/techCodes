/*

To find Minimum Depth of a given Binary Tree
       1
      / \
     2   3
    / \   \
   4   5   6
        \
         7
         
         O/p: 3 (since right side the min distance between root and leaf node is 3)
*/

import java.util.*;
import java.lang.*;

public class MinDepthBT {
   
   static Node root;
   static int depth=0;
   MinDepthBT(){
     root = null; 
   }
   public static void main(String args[]) {
      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.left.right.right = new Node(7);
      root.right.right = new Node(6);
     
   
      
      System.out.println("Minimum depth:" + findDepth(root));
   }
   
  
     static int findDepth(Node root){
        if(root == null){
         return 0;  
        }
        
        if(root.left == null && root.right == null){
           return 1;
        }
    
        if(root.left == null){
           return findDepth(root.right)+1;
        }
        
        if(root.right == null){
           return findDepth(root.left)+1;
        }
        
        
        return Math.min(findDepth(root.left) , findDepth(root.right))+1;
    }
                            
  
   
   static class Node {
      int data ;
      Node left ;
      Node right;
      
      Node(int data){
       this.data = data;
       left = right = null;
      }
   }
   
}
