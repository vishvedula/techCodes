/*
Convert Ternary Expression to a Binary Tree

Examples:

Input :  string expression =   a?b:c 
Output :        a
              /  \
             b    c

Input : expression =  a?b?c:d:e
Output :     a
           /  \
          b    e
        /  \
       c    d

*/
public class PrepareBT {
   
   static Node root ;
   static int i=0;
   
   PrepareBT(){
      root = null;
   }
   public static void main(String[] args) {
      String str = "a?b?c:d:e";
      
      char[] arr = str.toCharArray();
      
      
      
     root =  prepareBT(arr,i);
      
      printTree(root);
      
   }
   
   static Node prepareBT(char[] expression, int i){
      // Base case 
        if (i >= expression.length) 
            return null; 
       
        // store current character of expression_string 
        // [ 'a' to 'z'] 
        Node root = new Node(expression[i]); 
       
        // Move ahead in str 
        ++i; 
       
        // if current character of ternary expression is '?' 
        // then we add next character as a left child of 
        // current node 
        if (i < expression.length && expression[i]=='?') 
            root.left = prepareBT(expression, i+1); 
       
        // else we have to add it as a right child of 
        // current node expression.at(0) == ':' 
        else if (i < expression.length) 
            root.right = prepareBT(expression, i+1); 
       
        return root; 
      
   }
   
   static void printTree(Node root){
      
      if(root==null){
         return;
      }
      
      System.out.print(root.data);
      
      printTree(root.left);
      
      printTree(root.right);
   }
   
}

class Node{
   char data;
   Node left;
   Node right;
   
   Node(char data){
       this.data = data;
      left = right = null;
   }
}
