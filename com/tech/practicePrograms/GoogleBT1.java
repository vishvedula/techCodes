/*
This problem was asked by Google.
A unival tree (which stands for "universal value") is a tree where all nodes under it have the same
value.
Given the root to a binary tree, count the number of unival subtrees.
   a = 5                  a   = 2 (since parent 'a' has 2 diff kids , so not counted)          
  / \                    / \    the kids have no child , so they can be counted
 c   b                  b   a
    / \
   b   b
        \
         b
  a = 3 (since only 3 child 'a','a','A' leaves are to be counted, the parent ones should be elimiated finally)
 / \
 a a
  /\
 a a
    \
     A
     
     
     0 = 5 (the child leaves '1','0', and the last subTree 1-->1-->1 , are counted)
    / \
    1 0
     / \
     1 0
    / \
    1 1
*/
public class GoogleBT1 {

    public static void main(String args[]) {
       
       Node root = new Node(1);
       root.left = new Node(1);
       root.right = new Node(1);
       //root.right.left = new Node(1);
       
       
        System.out.println(countUnivalSubtrees(root));
    }

   
    private static class Node {

        private final int val;
        private Node left;
        private Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static int countUnivalSubtrees(Node node) {
        if (node == null)
            return 0;

        int count = countUnivalSubtrees(node.left);
        count += countUnivalSubtrees(node.right);

        return isUnivalTree(node) ? count + 1 : count;
    }

    private static boolean isUnivalTree(Node node) {
        if (node == null)
            return true;
        if (node.left != null && node.left.val != node.val)
            return false;
        if (node.right != null && node.right.val != node.val)
            return false;
        return isUnivalTree(node.left) && isUnivalTree(node.right);
    }

}
