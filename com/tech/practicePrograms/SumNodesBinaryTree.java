/*

    1+2+3+4+5+6+7 = 28
    
    
        1
       / \
      2   3
     / \ / \
    4  5 6  7
*/

public class SumNodesBinaryTree {
  static int sum = 0;

   Node root;
   SumNodesBinaryTree(){
      root = null;
   }
   
   public static void main(String[] args) {
      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right.left = new Node(6);
      root.right.right = new Node(7);
      
      System.out.println(sumOfNodes(root));
   }
   
   
   static int sumOfNodes(Node root){
      
      if(root==null){
         return 0 ;
      }
      
      sum +=root.data;
     
      if(root.left!=null){
         sumOfNodes(root.left);
      }
      
      if(root.right!=null){
         sumOfNodes(root.right);
      }
      
      return sum;
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
