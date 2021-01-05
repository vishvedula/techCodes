import java.util.*;

/*

       1       Mirror       1
      / \      ------>     / \
     2   3                3   2
    / \ / \              / \ / \
   4  5 6  7            7  6 5  4
 
*/
public class BinaryTreeMirror {
   public static void main(String[] args) {
      
      BinaryTreeMirror bt = new BinaryTreeMirror();
      bt.root=new Node(1);
      bt.root.left = new Node(2);
      bt.root.left.left = new Node(4);
      bt.root.left.right = new Node(5);
      bt.root.right= new Node(3);
      bt.root.right.left= new Node(6);
      bt.root.right.right= new Node(7);
      
      
      BinaryTreeMirror bt2 = new BinaryTreeMirror();
      bt2.root = new Node(1);
      bt2.root.left = new Node(3);
      bt2.root.left.left = new Node(7);
      bt2.root.left.right = new Node(6);
      bt2.root.right= new Node(2);
      bt2.root.right.left= new Node(5);
      bt2.root.right.right= new Node(4);
      
      System.out.print(checkMirror(bt.root,bt2.root));
      
   }
   
   
   static boolean checkMirror(Node root1,Node root2) {
      
      if(root1 == null && root2 == null){
         
         return true; // since both are null
         
      }
       //null check code to be placed here, to make sure return false, if the depth are not same
      if(root1 ==null || root2==null){
         return false;
      }
          
      if(root1.data != root2.data){
         return false;
      }
     
     return checkMirror(root1.left, root2.right) && 
                       checkMirror (root1.right, root2.left);
      
      
   }
   
   Node root;
   
   static class Node{
   int data;
   Node left, right;
   Node(int data){
       this.data= data;
       left=right=null;
      }
      
   }
   
}
