/*
This problem was asked by Apple.

Given the root of a binary tree, find the most frequent subtree sum. The subtree sum of a node is the sum of all values under a node,
 including the node itself.

For example, given the following tree:

  5
 / \
2  -5

Return 2 as it occurs twice: once as the left leaf, and once as the sum of 2 + 5 - 5.

         5
        / \
        2  -5
       / \ / \
      1  4 2  3
      
      return 2 , since the map would be like : {0=1, 1=1, 2=2, 3=1, 4=1, 7=1}
      The frequent generated number is :2


         5
        / \
        2  3
       / \ / \
      3  6 1  1

    {1=2, 3=1, 5=1, 6=1, 10=1, 11=1}
    The frequent generated number is :1

    O(N) Time complexity and O(N) space complexity since using HashMap to keep the count of occurence.

    Used Recursion !!!!!!

*/

import java.util.*;

public class FrequentSubTreeSum {

    private static Map<Integer, Integer> map = new HashMap<Integer,Integer>();

    public static void main(String args[]) {
        int result = Integer.MIN_VALUE;
        Node1 root = new Node1(5);
        root.left = new Node1(2);
        root.left.left = new Node1(1);
        root.left.right = new Node1(4);
        root.right = new Node1(-5);
        root.right.left = new Node1(2);
        root.right.right = new Node1(3);

        /*Node1 root = new Node1(5);
        root.left = new Node1(2);
        root.left.left = new Node1(3);
        root.left.right = new Node1(6);
        root.right = new Node1(3);
        root.right.left = new Node1(1);
        root.right.right = new Node1(1);*/

        /*Node1 root = new Node1(5);
        root.left = new Node1(2);
        root.right = new Node1(-5);*/
        

        findSubTreeSum(map,root);

        System.out.println(map);

        for(Map.Entry<Integer,Integer> entrySet: map.entrySet()){
            if(entrySet.getValue()>result){
                result = entrySet.getKey();
            }
        }
        System.out.println("The frequent generated number is :"+ result);
    }

    static void findSubTreeSum(Map<Integer,Integer> map,Node1 root){
        int count=0;

        // base conditions
        if(root == null){
            map.put(0,0);
        }

        if(root.left == null && root.right == null){
           
             if(null!=map.get(root.data) && map.get(root.data)>0){
                map.put(root.data, map.get(root.data)+1);
            } else{
                map.put(root.data, ++count);
            }
        }

        if(root.left !=null && root.right!=null){
            map.put(root.data+root.left.data+root.right.data,++count);
            findSubTreeSum(map, root.left);
            findSubTreeSum(map,root.right);
        }

    }
    
}

 class Node1{
    int data;
    Node1 left, right;

    Node1(int data){
        this.data = data;
        left=right=null;
    }
}
