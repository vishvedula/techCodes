/** Input :
 * Linked List before removing duplicates 
	10 12 10 11 12 11 10	
	
	Output:
	10 12 11 
	
 */

package com.thread.programs;

class RemovingDuplicatesFromLinkedList {
	 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    /* Function to remove duplicates from a unsorted linked list */
    @SuppressWarnings("unused")
	void remove_duplicates() {
        Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = head;
 
        /* Pick elements one by one */
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;
 
            /* Compare the picked element with rest of the elements */
            while (ptr2.next != null) {
 
                /* If duplicate then delete it */
                if (ptr1.data == ptr2.next.data) {
 
                    /* sequence of steps is important here */
                    dup = ptr2.next;
                    ptr2.next = ptr2.next.next;
                    System.gc();
                } else /* This is tricky */ {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }
 
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    @SuppressWarnings("static-access")
	public static void main(String[] args) {
    	RemovingDuplicatesFromLinkedList list = new RemovingDuplicatesFromLinkedList();
        list.head = new Node(10);
        list.head.next = new Node(12);
        list.head.next.next = new Node(10);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(12);
        list.head.next.next.next.next.next = new Node(11);
        list.head.next.next.next.next.next.next = new Node(10);
 
        System.out.println("Linked List before removing duplicates ");
        list.printList(head);
 
        list.remove_duplicates();
        System.out.println("");
        System.out.println("Linked List after removing duplicates");
        list.printList(head);
 
    }
}
