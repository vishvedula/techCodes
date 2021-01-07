import java.util.*;

public class DynamicBT {
   static Node root = null;
   public static void main(String[] args) {
     root = new Node(10);
      
     push(5);
     push(6);
     push(12);
     push(11);
   }
   
   static void push(int data) {  
          //Create a new node  
          Node newNode = new Node(data);  
  
          //Check whether tree is empty  
          if(root == null){  
              root = newNode;  
              return;  
            }  
          else {  
              //current node point to root of the tree  
              Node current = root, parent = null;  
  
              while(true) {  
                  //parent keep track of the parent node of current node.  
                  parent = current;  
  
                  //If data is less than current's data, node will be inserted to the left of tree  
                  if(data < current.data) {  
                      current = current.left;  
                      if(current == null) {  
                          parent.left = newNode;  
                          return;  
                      }  
                  }  
                  //If data is greater than current's data, node will be inserted to the right of tree  
                  else {  
                      current = current.right;  
                      if(current == null) {  
                          parent.right = newNode;  
                          return;  
                      }  
                  }  
              }  
          }  
      }  
}
 class Node{
   
   int data;
   Node left;
   Node right;
   
   Node(int data){
      this.data = data;
      left= right = null;
   }
   
}
