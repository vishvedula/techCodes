/*
Q. Program to find maximum width of a binary tree
Explanation

In this program, we need to find out the maximum width of the binary tree.
The width of the binary tree is the number of nodes present in any level.
So, the level which has the maximum number of nodes will be the maximum width of the binary tree. 
To solve this problem, traverse the tree level-wise and count the nodes in each level.

          1   ---> 1
         / \
        2   3 ---> 2 (answer should be 2)
       /
      4       ----> 1
      
      
      
      1    -->1
     / \
    2   3   -->2
   /     \
  4       5  -->2
 /  \      \
6    7      8  -->3 (answer would be 3)

*/

    import java.util.LinkedList;  
    import java.util.Queue;  
       
    public class CountMaxWidthBinaryTree {  
          
          //Represent the node of binary tree  
          public static class Node{  
            int data;  
            Node left;  
            Node right;  
              
            public Node(int data){  
              this.data = data;  
              this.left = null;  
              this.right = null;  
            }  
          }  
            
          //Represent the root of binary tree  
          public Node root;  
            
          public BinaryTree(){  
            root = null;  
          }  
            
          //findMaximumWidth() will find out the maximum width of the given binary tree  
          
          public int findMaximumWidth() {  
              int maxWidth = 0;  
                
              //Variable nodesInLevel keep tracks of number of nodes in each level  
              int nodesInLevel = 0;  
              //queue will be used to keep track of nodes of tree level-wise  
              Queue<Node> queue = new LinkedList<Node>();  
                
              //Check if root is null, then width will be 0  
              if(root == null) {  
                  System.out.println("Tree is empty");  
                  return 0;  
              }  
              else {  
                  //Add root node to queue as it represents the first level  
                  queue.add(root);  
                    
                  while(queue.size() != 0) {  
                        
                      //Variable nodesInLevel will hold the size of queue i.e. number of elements in queue  
                      nodesInLevel = queue.size(); 
                      
                      //maxWidth will hold maximum width.   
                      //If nodesInLevel is greater than maxWidth then, maxWidth will hold the value of nodesInLevel  
                      
                      maxWidth = Math.max(maxWidth, nodesInLevel);  
                        
                      //If variable nodesInLevel contains more than one node   
                      //then, for each node, we'll add left and right child of the node to the queue  
                      
                      while(nodesInLevel > 0) {  
                         Node current = queue.remove();  
                         if(current.left != null)   
                             queue.add(current.left);  
                         if(current.right != null)   
                             queue.add(current.right);  
                         nodesInLevel--;  
                      }  
                  }  
              }  
              System.out.println("The maxWidth: "+ maxWidth);
              return maxWidth;  
          }  
            
          public static void main(String[] args) {  
                
              CountMaxWidthBinaryTree bt = new CountMaxWidthBinaryTree();  
              //Add nodes to the binary tree  
              bt.root = new Node(1);  
              bt.root.left = new Node(2);  
              bt.root.right = new Node(3);  
              bt.root.left.left = new Node(4);  
              bt.root.left.right = new Node(5);  
              bt.root.right.left = new Node(6);  
              bt.root.right.right = new Node(7);  
              bt.root.left.left.left = new Node(8);  
                
              //Display the maximum width of given tree  
              System.out.println("Maximum width of the binary tree: " + bt.findMaximumWidth());  
          }  
    }  
