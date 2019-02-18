// Java program to print reverse of a linked list
class ReversingLinkedList
{
    Node head;  // head of list
 
    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d) {
            data = d; 
            next = null; 
        }
    }
 
    /* Function to print reverse of linked list */
    void printReverse(Node head)
    {
        if (head == null) return;
 
        // print list of head node
        printReverse(head.next);
 
        // After everything else is printed
        System.out.print(head.data+" ");
    }
 
    /* Utility Functions */
 
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
    	// Below Addition is O(1), but for this the insertion has to happen in reverseOrder
        Node new_node = new Node(new_data);
 
        new_node.next = head;
 
        head = new_node;
    	
        // Below insertion of node is O(n) as traversing till last element is needed. Insertion can happen in actual order
    	 /*Node new_node = new Node(new_data); 
    	  
    	    if (head == null) 
    	    { 
    	        head = new Node(new_data); 
    	        return; 
    	    } 
    	  
    	    new_node.next = null; 
    	  
    	    Node last = head;  
    	    while (last.next != null) 
    	        last = last.next; 
    	  
    	    last.next = new_node; 
    	    return; */
    	
    }
 
    /*Drier function to test the above methods*/
    public static void main(String args[])
    {
        // Let us create linked list 1->2->3->4
    	ReversingLinkedList llist = new ReversingLinkedList();
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
    	
        /*llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);*/
        llist.printReverse(llist.head);
    }
}
