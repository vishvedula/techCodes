import java.util.Set;
import java.util.HashSet;
public class LinkedListRemoveLoopExample{
    
   // Creating 2 nodes initially   
   static Node head; 
   static Node previous;
    
    static class Node{
        int data;
        Node next = null;
        Node(int x){
          data = x;
        }
        
        
    }

     public static void main(String []args){
       // Can have a cleaner way to push items to list
       // for now using layman way
        Node root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next = new Node(3);
        root.next.next.next.next = new Node(4);
        root.next.next.next.next.next = new Node(4);
        root.next.next.next.next.next.next = new Node(5);
        
        hasLoop(root);
        
        
     }
     
     // To check if LinkedList has loop
     /*static boolean hasLoop(Node root){
         Set<Integer> set = new HashSet<Integer>();
         if(root==null){
             return true;
         }
         
         while(root!=null){
             
                 if(set.contains(root.data)){
                     System.out.print("LinkedList Contains loop");
                     return true;
                 }
                 set.add(root.data);
                 root = root.next;
             
         } 
             System.out.print("LinkedList Doesnt contain loop");
        
         return false;
     }*/
     
     
     // To remove the loop by breaking the chain
     static void  hasLoop(Node root){
         head = root; // head always points to first node
         previous = root; // initially previous also points to first node
         Set<Integer> set = new HashSet<Integer>();
         /*if(root==null){
             return true;
         }*/
         
         while(root!=null){
             
                 if(set.contains(root.data)){
                     System.out.print("LinkedList Contains loop --> ");
                     
                    previous.next = root.next; // logic to break the chain
                    
                 }
                 set.add(root.data);
                 previous = root; // if root points to 2nd node, previous points to 1st node and increments accordingly
                 root = root.next;
             
         } 
             
        // Looping from first node
        while(head!=null){
            System.out.print(" "+ head.data);
            head= head.next;
        }
        
         
     }
     
}
