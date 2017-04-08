package com.thread.programs;

//A recursive java program to print reverse level order traversal

//A binary tree node
class ReverseNode 
{
 int data;
 ReverseNode left, right;
   
 ReverseNode(int item) 
 {
     data = item;
     left = right;
 }
}

class ReverseTreeNode 
{
	ReverseNode root;

 /* Function to print REVERSE level order traversal a tree*/
 void reverseLevelOrder(ReverseNode node) 
 {
     int h = height(node);
     int i;
     for (i = h; i >= 1; i--) 
     //THE ONLY LINE DIFFERENT FROM NORMAL LEVEL ORDER
     {
         printGivenLevel(node, i);
     }
 }
 
 /* Compute the "height" of a tree -- the number of
 nodes along the longest path from the root node
 down to the farthest leaf node.*/
int height(ReverseNode node) 
{
    if (node == null)
        return 0;
    else
    {
        /* compute the height of each subtree */
        int lheight = height(node.left);
        int rheight = height(node.right);

        /* use the larger one */
        if (lheight > rheight)
            return (lheight + 1);
        else
            return (rheight + 1);
    }
}

 /* Print nodes at a given level */
 void printGivenLevel(ReverseNode node, int level) 
 {
     if (node == null)
         return;
     if (level == 1)
         System.out.print(node.data + " ");
     else if (level > 1) 
     {
         printGivenLevel(node.left, level-1);
         printGivenLevel(node.right, level-1);
     }
 }

 

 // Driver program to test above functions
 public static void main(String args[]) 
 {
	 ReverseTreeNode tree = new ReverseTreeNode();

     // Let us create trees shown in above diagram
     tree.root = new ReverseNode(1);
     tree.root.left = new ReverseNode(2);
     tree.root.right = new ReverseNode(3);
     tree.root.left.left = new ReverseNode(4);
     tree.root.left.right = new ReverseNode(5);
       
     System.out.println("Level Order traversal of binary tree is : ");
     tree.reverseLevelOrder(tree.root);
 }
}
