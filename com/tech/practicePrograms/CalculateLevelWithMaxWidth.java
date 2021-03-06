// Java program to calculate width of binary tree
  
/* A binary tree node has data, pointer to left child
   and a pointer to right child */
class Node 
{
    int data;
    Node left, right;
  
    Node(int item) 
    {
        data = item;
        left = right = null;
    }
}
  
class BinaryTree 
{
    Node root;
  
    /* Function to get the maximum width of a binary tree*/
    int getMaxWidth(Node node) 
    {
        int maxWidth = 0;
        int width;
        int levelWithMaxWidth = 0;
        int h = height(node);
        int i;
  
        /* Get width of each level and compare 
           the width with maximum width so far */
        for (i = 1; i <= h; i++) 
        {
            width = getWidth(node, i);
            if (width > maxWidth){
            	maxWidth = width;
            } else if(width < maxWidth){
            	break;
            }
            levelWithMaxWidth = getLevel(node,i); 
        }
        System.out.println("The level at which max elements are present is: "+(levelWithMaxWidth));
        return maxWidth;
    }
  
    /* Get width of a given level */
    int getWidth(Node node, int level) 
    {
        if (node == null)
            return 0;
  
        if (level == 1)
            return 1;
        else if (level > 1)
            return getWidth(node.left, level - 1)
                    + getWidth(node.right, level - 1);
        return 0;
    }
    
    int getLevel(Node node, int level){
    	if (node == null)
            return 0;
  
        if (level == 1)
            return 1;
        else if (level > 1)
            return level;
        return 0;
    }
  
    /* UTILITY FUNCTIONS */
     
    /* Compute the "height" of a tree -- the number of
     nodes along the longest path from the root node
     down to the farthest leaf node.*/
    int height(Node node) 
    {
        if (node == null)
            return 0;
        else
        {
            /* compute the height of each subtree */
            int lHeight = height(node.left);
            int rHeight = height(node.right);
              
            /* use the larger one */
            return (lHeight > rHeight) ? (lHeight + 1) : (rHeight + 1);
        }
    }
  
    /* Driver program to test above functions */
    public static void main(String args[]) 
    {
        BinaryTree tree = new BinaryTree();
         
        /*
        Constructed bunary tree is:
              1
            /  \
        	2   4
         /  \  /  \
        0   6  3   8 
       /   / \   /  \
     -1  -4   16 6   7
     /
   -2    
         *
         */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(0);
        tree.root.left.left.left = new Node(-1);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(-4);
        tree.root.left.right.right = new Node(16);
        tree.root.right.left = new Node(3);
        tree.root.right.right = new Node(8);
        tree.root.right.right.left = new Node(-20);
        tree.root.right.right.right = new Node(23);
        tree.root.left.left.left.left = new Node(-2);
  
        System.out.println("Maximum width is, i.e Number of max elements for a given level are " + tree.getMaxWidth(tree.root));
        
    }
}
  
