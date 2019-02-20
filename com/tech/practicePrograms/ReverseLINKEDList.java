/*
Reversing a LINKED LIST
*/

//Java program for reversing the linked list

public class ReverseLinkedList {

 static Node head;

 static class Node {

     int data;
     Node next;

     Node(int d) {
         data = d;
         next = null;
     }
 }

 /* Function to reverse the linked list */
 Node reverse(Node node) {
     Node currentNode = node; //starts with 1
     Node prevNode = null;
     Node nextNode = null;
     while (currentNode != null) {
         nextNode = currentNode.next; // 2 comes at first place, followed by 3 & 4 recursively
         currentNode.next = prevNode; // setting NULL here for 1, such that 1.next --> NULL
         prevNode = currentNode;
         currentNode = nextNode;
     }
     node = prevNode;
     return node;
	 
// Using ArrayList , simple logic
    	
        /*Node currentNode = node;
    	List list = new ArrayList<Integer>();
    	while(currentNode!=null){
    		list.add(currentNode.data);
    		currentNode = currentNode.next;
    	}
    	
    	Collections.reverse(list);
    	node = null;
    	
    	// inserting data from list to head Node
    	for(int i=0; i< list.size(); i++){
    		if(node == null){
    			node = new Node((int)list.get(i));
    		} else {
    			Node dup = node;
    			while(dup.next!=null){
    				dup = dup.next;
    			}
    			 dup.next = new Node((int)list.get(i));
    		}
    	}
    	
    	return node;*/
 }

 // prints content of double linked list
 void printList(Node node) {
     while (node != null) {
         System.out.print(node.data + " ");
         node = node.next;
     }
 }

 @SuppressWarnings("static-access")
public static void main(String[] args) {
	 ReverseLinkedList list = new ReverseLinkedList();
     list.head = new Node(1);
     list.head.next = new Node(2);
     list.head.next.next = new Node(3);
     list.head.next.next.next = new Node(4);
      
     System.out.println("Given Linked list");
     list.printList(head);
     head = list.reverse(head);
     System.out.println("");
     System.out.println("Reversed linked list ");
     list.printList(head);
 }
}
