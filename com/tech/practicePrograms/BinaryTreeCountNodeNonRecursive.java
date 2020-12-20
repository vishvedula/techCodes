/**
    A non-recursive way of counting the number of nodes.
    
    Using a Queue.
    
           2
          / \
        7    5
        \    \
        6    9
        / \ /  \
        1 11 4  12
*/

import java.util.Queue;
import java.util.*;

public class BinaryTreeCountNodeNonRecursive
{
   static int countNodes=0;
    Node root;
 
    /* Function to get the count of full Nodes in
    a binary tree*/
   
   // Non-recursive way of finding number of Nodes
   
   
    int countNodes(Node root) 
    {
       int countNodes = 0;
       
      if( root == null ){
        return countNodes;
    } else{
         
         Queue<Node> queue= new LinkedList<Node>(); 
         
         queue.add(root);// Add the parent root here
         
         countNodes = 1;
         
         int noOfNodesLevel = queue.size();
         
         while(queue.size()!=0) {
            noOfNodesLevel = queue.size();
        
           while(noOfNodesLevel >0){
               
               Node current  = queue.remove(); // returns the pointer to the Node
               
               if(current.left!=null){
                  queue.add(current.left);
                  countNodes++;
               }
               
               if(current.right!=null){
                  queue.add(current.right);
                  countNodes++;
               }
               
               noOfNodesLevel--;
            }
         
        
       }
            
     }
       
       return countNodes;
    }
   
   static class Node{
      int data;
      Node left, right;
      
      Node(int data){
       this.data = data;  
       left = right = null;
      }
   }
 
    public static void main(String args[]) 
    {
        /* 2
          / \
        7    5
        \    \
        6    9
        / \ /  \
        1 11 4  12
        Let us create Binary Tree shown in 
        above example */
    	BinaryTreeCountNodeNonRecursive tree_level = new BinaryTreeCountNodeNonRecursive();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.right = new Node(6);
        tree_level.root.left.right.left = new Node(1);
        tree_level.root.left.right.right = new Node(11);
        tree_level.root.right.right = new Node(9);
        tree_level.root.right.right.left = new Node(4);
        tree_level.root.right.right.right = new Node(12);
        tree_level.root.right.right.right.left = new Node(13);
 
        System.out.println(tree_level.countNodes(tree_level.root));
         
    }
}
