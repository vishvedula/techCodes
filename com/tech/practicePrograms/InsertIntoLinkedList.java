/*
To insert into LinkedList as per the insertion order
*/

public class InsertLinkedList {
   static Node root;
   static Node currentNode;
   
   InsertLinkedList(){
    root = null;  
   }
   
   public static void main(String[] args) {
      
      InsertLinkedList list = new InsertLinkedList();
      list.push(1);
      list.push(2);
      list.push(3);
      
      
   }
   
   static void push (int x){
      Node nextNode = null;
      if(root == null) {
         root = new Node(x);
         currentNode = root;
      } else{
         nextNode = new Node(x);
         currentNode.next = nextNode;
         currentNode = currentNode.next;
      }
      
   }
   static class Node{
      int data;
      Node next;
      
      Node(int data){
         this.data = data;
         next = null;
      }
   }
}
