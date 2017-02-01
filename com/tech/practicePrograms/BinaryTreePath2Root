
/**
 Input:
 Given Binary Tree

 Output: Print all the root-to-leaf path

    1->2->3
    1->2->5
    1->3
 */
package com.thread.programs;

import java.util.ArrayList;
import java.util.List;
 

class TreeNode {
    TreeNode left, right;
    int val;
 
    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinaryTreePath2Root {
 
    public List<List<Integer>> binaryTreePaths(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        if (root != null){
            searchBT(root, new ArrayList<Integer>(), answer);
        }
        return answer;
    }
 
    
    // Recursive method to find the root's and its children
    private void searchBT(TreeNode root, List<Integer> currentPath, List<List<Integer>> allPaths) {
        currentPath.add(root.val);
        if (root.left == null && root.right == null){
            allPaths.add(currentPath);
            return;
        }
         
        if (root.left != null){
            searchBT(root.left,  new ArrayList<>(currentPath), allPaths);
        }
         
        if (root.right != null){
            searchBT(root.right,  new ArrayList<>(currentPath), allPaths);
        }
    }
     
    public static void main(String args[]) {
        BinaryTreePath2Root tree = new BinaryTreePath2Root();
        TreeNode  root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
 
        System.out.println(tree.binaryTreePaths(root));
    }
}
