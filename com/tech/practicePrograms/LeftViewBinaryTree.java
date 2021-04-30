
/*

Java code to print the Left view of a Binary Tree

         1
        /  \
       2    3
        \  / \
         7 4  5
         /  \
         9   6
              \
               8

         left view --> 1,2,7,9,8
   
         1  --> 1st level
        /  \
       2    3 --> 2nd level
        \  / \
         7 4  5 --> 3rd level
         /   \
         9   6  --> 4th level
        / \  /
      10  11 8 --> 5th level
          /   \
         12    14--> 6th level
           \    / \
            18  15 20--> 7th level   
            /    / \
          22    19 21--> 8th level
        
          left view --> 1, 2, 7, 9, 10, 12, 18, 22

*/
import java.util.LinkedList;
import java.util.*;
public class BinaryTreeLeftView {

   public static int level = 1;

   public static Map<Integer, Integer> map = new HashMap<Integer,Integer>();

   public static List<Integer> result = new ArrayList<>();
    
   public static Queue<Node> q =  new LinkedList<Node>();

   public static Set<Integer> set = new HashSet<Integer>();

   public static transient int levelLeft =0;
   public static transient int levelRight =0;

   public static void main(String[] args) {

      Node root = new Node(1);
      root.left = new Node(2);
      root.left.right = new Node(7);
      root.left.right.left = new Node(9);
      root.left.right.left.left = new Node(10);
      root.left.right.left.right = new Node(11);
      root.left.right.left.right.left  = new Node(12);
      root.left.right.left.right.left.right  = new Node(18);
      root.left.right.left.right.left.right.left  = new Node(22);
      root.right = new Node(3);
      root.right.left = new Node(4);
      root.right.right = new Node(5);
      root.right.left.right= new Node(6);
      root.right.left.right.right = new Node(8);
      root.right.left.right.right.right = new Node(14);
      root.right.left.right.right.right.right = new Node(20);
      root.right.left.right.right.right.left = new Node(15);
      root.right.left.right.right.right.left.right = new Node(21);
      root.right.left.right.right.right.left.left = new Node(19);
     
      findLeftView(root);
     
   }
   
   static void findLeftView(Node root){
     
      // Base condition 
      // Start
      if(null != root){ //for null root
        q.add(root);
        map.put(root.data,level);
        result.add(root.data);
        set.add(level);
      } else{
       return; // Empty mapList
      }

      if(root.left == null && root.right == null){ // for root with no left and right subTree
          map.put(root.data, level);
          result.add(root.data);
          set.add(level);
          return ;
      }
     
      // if root.left !=null , then pick the left subtree tree and traverse 
      // entire left sub tree till a root node has no left and right child
     
      while(!q.isEmpty()){
          Node current = q.remove();
          if(current.left !=null){
             level++;
              traverseLeftSubTree(current.left, level, map);
          }

          if(current.right != null){
             current = root.right;
             levelRight = 2;
             map.put(current.data,levelRight);
             //q.add(current);
            traverseRightSubTree(current, levelRight, map);
          }

      }

      System.out.println(String.valueOf(result));
      System.out.println("The leftSubTree max level is: "+ levelLeft);
     
   }

   

   private static void  traverseLeftSubTree(Node current , int level, Map<Integer,Integer> map){
      // here i shld traverse to that level and then check for further 
      // entries
      
      map.put(current.data, level);

      if(!set.contains(map.get(current.data))){
         set.add(level);
         result.add(current.data);
      } 
      
      if(current.left == null && current.right == null){
         levelLeft = level;
          
          //return;
          
      } else {
         if(current.left !=null){
            q.add(current.left);
            
         } if(current.right !=null){
            q.add(current.right);
         }
     
         level++;
      }
      
      if(!q.isEmpty()){
         traverseLeftSubTree(q.remove(), level, map);

      }
   }


private static void  traverseRightSubTree(Node current , int levelRight, Map<Integer, Integer> map){
    // loop through the elements till the level thats not in SET is achieved
    int sameLevel = 0;
    while(set.contains(map.get(current.data))){
         //current = q.remove();
         if(current.left!=null && current.right!=null){
            sameLevel = ++levelRight;
            q.add(current.left);
            q.add(current.right);
            map.put(current.left.data,sameLevel);
            map.put(current.right.data,sameLevel);
         } else if(current.left!=null){
            q.add(current.left);
            sameLevel = ++levelRight;
            map.put(current.left.data,sameLevel);
         } else  if(current.right!=null){
            q.add(current.right);
            sameLevel = ++levelRight;
            map.put(current.right.data,sameLevel);

         }
         if(!q.isEmpty()){
            current = q.remove();
         } else{
            break;
         }
    }

    if(!set.contains(map.get(current.data))){
         result.add(current.data);
    }
 }

}

 class Node {
 Node left;
  Node right;
 int data;
   
 public  Node(int data){
      this.data = data;
      left = right = null;
   }
     
     
}
