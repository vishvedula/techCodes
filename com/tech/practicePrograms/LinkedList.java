
	// Java program to count number of nodes in a linked list
	 
	// Linked List class
	public class LinkedList
	{
	    Node head;  // head of list
	 
	    /* Inserts a new Node at front of the list. */
	    public void push(int data)
	    {
	        Node node = new Node(data);
	       // System.out.println(node.data);
	 
	        /* Make next of new Node as head */
	        node.next = head;
	 
	        /* Move the head to point to new Node */
	        head = node;
	    }
	 
	    /* Returns count of nodes in linked list */
	    public int getCount()
	    {
	        Node temp = head;
	        int count = 0;
	        while (temp != null)
	        {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	    }
	 
	    /* Drier program to test above functions. Ideally
	       this function should be in a separate user class.
	       It is kept here to keep code compact */
	    public static void main(String[] args)
	    {
	        /* Start with the empty list */
	        LinkedList llist = new LinkedList();
	        llist.push(1);
	        llist.push(3);
	        llist.push(1);
	        llist.push(2);
	        llist.push(1);
	        llist.push(1);
	        llist.push(1);
	        llist.push(1);
	        llist.push(1);
	        llist.push(1);
	 
	        System.out.println("Count of nodes is " + llist.getCount());
	    }
	    

		/* Linked list Node*/
		class Node
		{
		    int data;
		    Node next;
		    Node(int d) 
		    {
		    	data = d;
		    	next = null;
		    }
		}
	}
