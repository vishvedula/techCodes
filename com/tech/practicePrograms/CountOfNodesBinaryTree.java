// Class to count full nodes of Tree 

class BinaryTree1 
{
 
    Node root;
 
    /* Function to get the count of full Nodes in
    a binary tree*/
    int countNodes(Node root2) 
    {
    
    if( root2 == null ){
        return 0;
    }
    
    if( root2.left == null && root2.right == null ){
        return 1;
    }

    // all other nodes count the nodes from their left and right subtree
    // as well as themselves
    return countNodes( root2.left ) + countNodes( root2.right ) + 1;
    }
 
    public static void main(String args[]) 
    {
        /* 2
          / \
        7    5
        \    \
        6    9
        / \ /  \
        1 11 4  12
        Let us create Binary Tree shown in 
        above example */
    	BinaryTree1 tree_level = new BinaryTree1();
        tree_level.root = new Node(2);
        tree_level.root.left = new Node(7);
        tree_level.root.right = new Node(5);
        tree_level.root.left.right = new Node(6);
        tree_level.root.left.right.left = new Node(1);
        tree_level.root.left.right.right = new Node(11);
        tree_level.root.right.right = new Node(9);
        tree_level.root.right.right.left = new Node(4);
        tree_level.root.right.right.right = new Node(12);
 
        System.out.println(tree_level.countNodes(tree_level.root));
         
    }
}
