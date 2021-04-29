
/*

Java code to print the Left view of a Binary Tree

          1
        /  \
       2    3
        \  / \
         7 4  5
            \
            6

         left view --> 1,2,7

   
         1  --> 0th level
        /  \
       2    3 --> 1st level
        \  / \
         7 4  5 --> 2nd level
         /   \
         9   6  --> 3rd level
        / \  /
      10  11 13 --> 4th level
          /   \
         12    14--> 5th level
           \    /
            18  15 --> 6th level   
                /
                19
        
          left view --> 1,2,7,9,10,12,18,19

*/
import java.util.LinkedList;
import java.util.*;
public class BinaryTreeLeftView {

   public static int level =0;

   public static Map<Integer, Integer> map = new HashMap<Integer,Integer>();

   public static List<Integer> result = new ArrayList<>();
    
   public static Queue<Node> q =  new LinkedList<Node>();

   public static Set<Integer> set = new HashSet<Integer>();

   public static transient int levelLeft =0;
   public static void main(String[] args) {
/*
         1
        /  \
       2    3
        \  / \
         7 4  5
            \
            6

         left view --> 1,2,7

   
         1  --> 0th level
        /  \
       2    3 --> 1st level
        \  / \
         7 4  5 --> 2nd level
         /   \
         9   6  --> 3rd level
        / \  /
      10  11 13 --> 4th level
          /   \
         12    14--> 5th level
           \    /
            18  15 --> 6th level   
                /
                19
        
          left view --> 1,2,7,9,10,12,18,19

   */

      Node root = new Node(1);
      root.left = new Node(2);
      root.left.right = new Node(7);
      root.left.right.left = new Node(9);
      root.left.right.left.left = new Node(10);
      root.left.right.left.right = new Node(11);
      root.left.right.left.right.left  = new Node(12);
      root.left.right.left.right.left.right  = new Node(18);
      root.right = new Node(3);
      root.right.left = new Node(4);
      root.right.right = new Node(5);
      root.right.left.right= new Node(6);
     
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
             current = root;
            //traverseRightSubTree(current, levelLeft, map);
          }

      }

      System.out.println(String.valueOf(result));
      System.out.println("The leftSubTree max level is: "+ levelLeft);
     
   }

   /*
        
         1  --> 0th level
        /  \
       2    3 --> 1st level
        \  / \
         7 4  5 --> 2nd level
         /   \
         9   6  --> 3rd level
        / \  /
      10  11 13 --> 4th level
          /   \
         12    14--> 5th level
               /
               15 --> 6th level
   */
   

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

/*
         1  --> 0th level
        /  \
       2    3 --> 1st level
        \  / \
         7 4  5 --> 2nd level
         /   \
         9   6  --> 3rd level
        / \  /
      10  11 13 --> 4th level
          /   \
         12    14--> 5th level
               /
               15 --> 6th level
   */

private static void  traverseRightSubTree(Node current , int level, List<Integer> map){
   
   //map.add(current.data);
   int levelRight = 1;

   q.add(current.right);
   
   while(!q.isEmpty()){
      current = q.remove();
      /*if(current.left == null && current.right == null){
         return;
      }*/
      
      if(current.left != null ){
         q.add(current.left);
      }
      if(current.right != null){
         q.add(current.right);
      }
      levelRight ++;

   }

   if(levelRight > level) { // We need to continue printing elements from this level
      while(!q.isEmpty()){
         current = q.remove(); // new current from the needed level
         if(current.left == null && current.right == null){
            map.add(current.data);
         }
      }
   }
   
      //traverseRightSubTree(q.remove(), level, map);
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
