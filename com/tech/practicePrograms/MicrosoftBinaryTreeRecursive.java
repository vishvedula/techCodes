/*
This problem was asked by Microsoft.
Suppose an arithmetic expression is given as a binary tree. 
Each leaf is an integer and each internal
node is one of "+", "−", "∗", or "/".
Given the root to such a tree, write a function to evaluate it.
For example, given the following tree:
   *
 /  \
 +   +
/ \ / \
3 2 4 5
You should return 45, as it is (3 + 2) * (4 + 5).

*/
import java.util.Queue;
import java.util.*;
public class MicrosoftBinaryTreeRecursive {
    static Node root = null;
    static Queue<Node> queue = new LinkedList<Node>();
    static List<Integer> list = new ArrayList<>();
   static String finalOperand = " ";
   static int firstResult =0 , secondResult =0;
   static int result = 0;
   
   public static void main(String[] args) {
       
       Node root = new Node("*");
       root.left = new Node("+");
       root.left.left = new Node("3");
       root.left.right = new Node("2");
       root.right = new Node("+");
       root.right.left = new Node("4");
       root.right.right = new Node("5");
       
      finalOperand = root.data;
      
      System.out.println("Output is :"+findValue(root));
      
   }
   
   
   static int findValue(Node root){
    
      if(root.data.equals("+")){
         return findValue(root.left)+ findValue(root.right);
      }else if (root.data.equals("-")){
         return findValue(root.left) - findValue(root.right);
      }else if (root.data.equals("*")){
         return findValue(root.left) * findValue(root.right);
      }else if (root.data.equals("/")){
         return findValue(root.left) / findValue(root.right);
      }else{
         return Integer.valueOf(root.data);
      }
   }
}

class Node{
    String data;
    Node left;
    Node right;
    
    Node(String data){
        this.data = data;
        left = right = null;
    }
   
}
