/*
 * Given a Binary Tree and a sum s, your task is to check whether there is a root 
 * to leaf path in that tree with the following sum . You are required to complete the function hasPathSum. 
 * You should not read any input from stdin/console. There are multiple test cases. 
 * For each test case, this method will be called individually.

Input:
The task is to complete the function hasPathSum which takes 2 arguments, root of the Tree and a value sum. 
The struct node has a data part which stores the data, pointer to left child and pointer to right child.
There are multiple test cases. For each test case, this method will be called individually.

Output:
The function should return the true if such path exist else return false.

Constraints:
1 <=T<= 30
1 <=Number of nodes<= 100
1 <=Data of a node<= 1000

Example:

Input
2
2
1 2 L 1 3 R
2 
2
1 2 L 1 3 R
4

Output 
0
1
 */
	// Java program to print to print root to leaf path sum equal to
	// a given number
	  
	/* A binary tree node has data, pointer to left child
	   and a pointer to right child */


	 class BinarySumNode 
	{
	    int data;
	    Node left, right;
	  
	    BinarySumNode(int item) 
	    {
	        data = item;
	        left = right = null;
	    }
	}
	  
	class BinaryFindSum {
	  
	    Node root;
	      
	    /*
	     Given a tree and a sum, return true if there is a path from the root
	     down to a leaf, such that adding up all the values along the path
	     equals the given sum.
	   
	     Strategy: subtract the node value from the sum when recurring down,
	     and check to see if the sum is 0 when you run out of tree.
	     */
	  
	    boolean haspathSum(Node node, int sum) 
	    {
	        if (node == null)
	            return (sum == 0);
	        else
	        {
	            boolean ans = false;
	  
	            /* otherwise check both subtrees */
	            int subsum = sum - node.data	;
	            if (subsum == 0 && node.left == null && node.right == null)
	                return true;
	            if (node.left != null)
	                ans = ans || haspathSum(node.left, subsum);
	            if (node.right != null)
	                ans = ans || haspathSum(node.right, subsum);
	            return ans;
	        }
	    }
	     
	    /* Driver program to test the above functions */
	    public static void main(String args[]) 
	    {
	        int sum = 21;
	         
	        /* Constructed binary tree is
	              10
	             /  \
	           8     2
	          / \   /
	         3   5 2
	        */
	        BinaryFindSum tree = new BinaryFindSum();
	        tree.root = new Node(10);
	        tree.root.left = new Node(8);
	        tree.root.right = new Node(2);
	        tree.root.left.left = new Node(3);
	        tree.root.left.right = new Node(5);
	        tree.root.right.left = new Node(2);
	  
	        if (tree.haspathSum(tree.root, sum))
	            System.out.println("There is a root to leaf path with sum " + sum);
	        else
	            System.out.println("There is no root to leaf path with sum " + sum);
	    }
	}