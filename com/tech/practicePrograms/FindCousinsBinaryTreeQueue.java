import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// # Good morning! Heres your coding interview problem for today.

// # This problem was asked by Yext.

// # Two nodes in a binary tree can be called cousins if they are on the same level of the tree but have 
//different parents. For example, in the following diagram 4 and 6 are cousins.

// #     1
// #    / \
// #   2   3
// #  / \   \
// # 4   5   6
// # Given a binary tree and a particular node, find all cousins of that node.

public class FindCousinsBinaryTreeQueue {

    Node root;

    static Queue<Node> queue = new java.util.LinkedList<Node>();
    public static void main (String args[]) {
        FindCousinsBinaryTreeQueue  cousins = new FindCousinsBinaryTreeQueue();
        cousins.root = new Node(1);
        cousins.root.left = new Node(2);
        cousins.root.right = new Node(3);
        cousins.root.left.left = new Node(4);
        cousins.root.left.right = new Node(5);
        cousins.root.right.left = new Node(6);

        findCousins(cousins.root);

    }


    static List<Integer> findCousins(Node root){
        int nodesInLevel =0;
        // Logic to check if we have siblings , or cousins

        if(root == null) {  
            System.out.println("Tree is empty");  
            return null;  
        }  
        else {  
            //Add root node to queue as it represents the first level  
            queue.add(root);  
              
            while(queue.size() != 0) {  
                  
                //Variable nodesInLevel will hold the current size of queue i.e. number of elements in queue  
                nodesInLevel = queue.size(); 
                List<Integer> list = new ArrayList<Integer>();
                //If variable nodesInLevel contains more than one node   
                //then, for each node, we'll add left and right child of the node to the queue  
                
                while(nodesInLevel > 0) {  
                   Node current = queue.remove();
                   list.add(current.data);
                   if(current.left != null)   
                       queue.add(current.left);  
                   if(current.right != null)   
                       queue.add(current.right);  
                   nodesInLevel--;  
                  
                }
                
                if(list.size()>2){
                    System.out.print("We have cousins here ");
                    // System.out.print(Arrays.asList(list));
                    System.out.print(list.toString());
                    break;
                }
            } 
        }  
      return null;

    }

    static class Node{
        int data;
        Node left, right;
        
        Node(int data){
         this.data = data;  
         left = right = null;
        }
     }
    
}

