/*
This problem was asked by Microsoft.
Suppose an arithmetic expression is given as a binary tree. 
Each leaf is an integer and each internal
node is one of '+', '−', '∗', or '/'.
Given the root to such a tree, write a function to evaluate it.
For example, given the following tree:
  *
 / \
 +   +
/ \ / \
3 2 4 5
You should return 45, as it is (3 + 2) * (4 + 5).

*/
import java.util.Queue;
import java.util.*;
public class MicrosoftBinaryTree {
    static Node root = null;
    static Queue<Node> queue = new LinkedList<Node>();
   static List<Integer> list = new ArrayList<>();
   public static void main(String[] args) {
       
       Node root = new Node('*');
       root.left = new Node('+');
       root.left.left = new Node('3');
       root.left.right = new Node('2');
       root.right = new Node('+');
       root.right.left = new Node('4');
       root.right.right = new Node('5');
       
      System.out.println( findValue(root));
      
   }
   
   
   static int findValue(Node root){
      
       int result = 0;
      boolean leaf = false;
      int first = 0,second =0;
        queue.add(root);
      int temp=0;
       char finalOperation = root.data;
       System.out.println(finalOperation);
        
        while(queue.size()>0){
            Node current = queue.remove();
            char operand = current.data;
            if(current.left!=null){
               if(Character.isDigit(current.left.data)){
                   first = Integer.valueOf(current.left.data)-'0';
                  leaf = true;
                  System.out.println(first);
               }else{
                queue.add(current.left);
               }
                
            }
            
            if(current.right!=null){
               if(Character.isDigit(current.right.data)){
                   second = Integer.valueOf(current.right.data)-'0';
                  System.out.print(second);
               }else{
                queue.add(current.right);
               }
                
            }
           if(leaf){
              
              if(operand == '+'){
                  temp = first + second;
              } else if(operand == '-'){
                  temp = first - second;
              } else if(operand == '*'){
                  temp = first * second;
              }else if (operand == '/'){
                  temp = first / second;
              }
              
               list.add(temp);
              
           }
           
          System.out.println();
           
           
        }
       
      System.out.println(list);
       if(finalOperation == '+'){
                  result = list.get(0) + list.get(1);
              } else if(finalOperation == '-'){
                  result = list.get(0) - list.get(1);
              } else if(finalOperation == '*'){
                 result = list.get(0) * list.get(1);
              }else if (finalOperation == '/'){
                  result = list.get(0) / list.get(1);
              }
       
       return result;
   }
}

class Node{
    char data;
    Node left;
    Node right;
    
    Node(char data){
        this.data = data;
        left = right = null;
    }
   
}
