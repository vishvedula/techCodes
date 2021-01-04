/*
This problem was asked by Google.
A unival tree (which stands for "universal value") is a tree where all nodes under it have the same
value.
Given the root to a binary tree, count the number of unival subtrees.

   a = 5                  a   = 2 (since parent 'a' has 2 diff kids , so not counted)          
  / \                    / \    the kids have no child , so they can be counted
 c   b                  b   a
    / \
   b   b
        \
         b


  a = 3 (since only 3 child 'a','a','A' leaves are to be counted, the parent ones should be elimiated finally)
 / \
 a a
  /\
 a a
    \
     A
     
     
     0 = 5 (the child leaves '1','0', and the last subTree 1-->1-->1 , are counted)
    / \
    1 0
     / \
     1 0
    / \
    1 1
*/

import java.lang.*;
import java.util.Queue;
import java.util.*;
public class GoogleBT {
   
    static Node root;
    static int count =0;
   static int nodeCounts =0;
    static Queue<Node> queue= new LinkedList<Node>();

   
   GoogleBT(){
      root =null;
   }
   

    public static void main(String args[]) {
       /*Node root = new Node("a");
       root.left = new Node("c");
       root.right = new Node("b");
       root.right.left = new Node("b");
       root.right.right = new Node("b");
       root.right.right.right = new Node("b");*/
       
       /*Node root = new Node("a");
       root.left = new Node("a");
       root.right = new Node("a");
       root.right.left = new Node("a");
       root.right.right = new Node("a");
       root.right.right.right = new Node("A");*/
       
       /*Node root = new Node("a");
       root.left = new Node("a");
       root.right = new Node("a");*/
       
       Node root = new Node("0");
       root.left = new Node("1");
       root.right = new Node("0");
       root.right.left = new Node("1");
       root.right.right = new Node("0");
       root.right.left.left = new Node("1");
       root.right.left.right = new Node("1");
       
       
       queue.add(root);
       
       findUVL(root);
        
       System.out.println(count);
     
} 
   
   static int findUVL(Node root){
     int parentNodes=0;
      while(queue.size()!=0){
         
         Node currentNode = queue.remove();
         
         if(currentNode.left!=null && currentNode.right!=null){
            if(currentNode.left.data.equals(currentNode.data) && 
               currentNode.right.data.equals(currentNode.data)){
               count++;
               parentNodes++;
            }
            queue.add(currentNode.left);
            queue.add(currentNode.right);
           
            
         } else if(currentNode.left!=null){
            queue.add(currentNode.left);
            if(currentNode.left.data.equals(currentNode.data)){
               count++;
            }else {
            count=Math.abs(count-parentNodes);
            }
         } else if(currentNode.right!=null){
            queue.add(currentNode.right);
            if(currentNode.right.data.equals(currentNode.data)){
               count++;
            } else{
            count=Math.abs(count-parentNodes);
            }
         } else if(currentNode.left==null && currentNode.right==null){
            count++;
         }
         
         
         
         }
      return count;
           
      }
      
}

 class Node{
  String data;
   Node left;
   Node right;
   
   Node(String data){
      this.data = data;
      left=right=null;
   }
}
