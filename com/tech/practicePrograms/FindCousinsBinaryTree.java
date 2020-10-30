package com.thread.programs;

//Java program to check if two binary tree are cousins
class NodeCousins {
	int data;
	NodeCousins left, right;

	NodeCousins(int item) {
		data = item;
		left = right = null;
	}
}


public class ToFindCousinsBinaryTree {
	public static void main(String args[])
	 {
	     BinaryTree tree = new BinaryTree();
	     tree.root = new NodeCousins(1);
	     tree.root.left = new NodeCousins(2);
	     tree.root.right = new NodeCousins(3);
	     tree.root.left.left = new NodeCousins(4);
	     tree.root.left.right = new NodeCousins(5);
	     tree.root.right.left = new NodeCousins(6);
	     tree.root.right.right = new NodeCousins(7);
	     tree.root.right.right.right = new NodeCousins(8);

	     NodeCousins Node1, Node2;
	     Node1 = tree.root.left.left; // 4
	     Node2 = tree.root.right.right; //7
	    
	     // Logic to check the Cousin case
	     if (tree.isCousin(tree.root, Node1, Node2))
	         System.out.println("Yes");
	     else
	         System.out.println("No");
	 }
}


class BinaryTree
{
 NodeCousins root;

 	// ****** Returns 1 if a and b are cousins, otherwise 0 ******
	boolean isCousin(NodeCousins node, NodeCousins a, NodeCousins b) {
		// 1. The two Nodes should be on the same level in the binary tree.
		// 2. The two Nodes should not be siblings (means that they should not have the same parent Node).
		return ((level(node, a, 1) == level(node, b, 1)) && (!isSibling(node, a, b)));
	}
	
	// ****** Recursive function to find level of Node 'ptr' in a binary tree ******
		int level(NodeCousins node, NodeCousins ptr, int lev) {
			// base cases
			if (node == null)
				return 0;

			if (node == ptr)
				return lev;

			// Return level if Node is present in left subtree
			int l = level(node.left, ptr, lev + 1);
			if (l != 0)
				return l;

			// Else search in right subtree
			return level(node.right, ptr, lev + 1);
		}
		
	// ****** Recursive function to check if two Nodes are siblings ******
	boolean isSibling(NodeCousins node, NodeCousins a, NodeCousins b) {
		// Base case
		if (node == null)
			return false;

		return ((node.left == a && node.right == b) || (node.left == b && node.right == a) || isSibling(node.left, a, b) || isSibling(node.right, a, b));
	}

}
