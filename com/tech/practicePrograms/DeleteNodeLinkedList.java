/**
 * You’re given the pointer to the head node of a linked list and the position of a node to delete. Delete the node at the given position and return the head node. A position of 0 indicates head, a position of 1 indicates one node away from the head and so on. The list may become empty after you delete the node.

Input Format

You have to complete the deleteNode(SinglyLinkedListNode* llist, int position) method which takes two arguments - 
the head of the linked list and the position of the node to delete. You should NOT read any input from stdin/console. 
position will always be at least 0 and less than the number of the elements in the list.

The first line of input contains an integer
, denoting the number of elements in the linked list.
The next lines contain an integer each in a new line, denoting the elements of the linked list in the order.
The last line contains an integer

denoting the position of the node that has to be deleted form the linked list.

Constraints

, where is the

    element of the linked list.

Output Format

Delete the node at the given position and return the head of the updated linked list. Do NOT print anything to stdout/console.

The code in the editor will print the updated linked list in a single line separated by spaces.

Sample Input

8
20
6
2
19
7
4
15
9
3

Sample Output

20 6 2 7 4 15 9

Explanation

The given linked list is 20->6->2->19->7->4->15->9. We have to delete the node at position 3, which is 19. After deleting that node, the updated linked list is: 20->6->2->7->4->15->9
 * @author vivedula
 *
 */
	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class DeleteNodeLinkedList {

	    static class SinglyLinkedListNode {
	        public int data;
	        public SinglyLinkedListNode next;

	        public SinglyLinkedListNode(int nodeData) {
	            this.data = nodeData;
	            this.next = null;
	        }
	    }

	    static class SinglyLinkedList {
	        public SinglyLinkedListNode head;
	        public SinglyLinkedListNode tail;

	        public SinglyLinkedList() {
	            this.head = null;
	            this.tail = null;
	        }

	        public void insertNode(int nodeData) {
	            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

	            if (this.head == null) {
	                this.head = node;
	            } else {
	                this.tail.next = node;
	            }

	            this.tail = node;
	        }
	    }

	    public static void printSinglyLinkedList(SinglyLinkedListNode node) throws IOException {
	        while (node != null) {
	           System.out.println((node.data));

	            node = node.next;

	        }
	    }

	    // Complete the deleteNode function below.

	    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
	    	SinglyLinkedListNode current = head;
	    	if(position == 1 && head.next==null){
	    		head = head.next;
	    		return head;
	    	}
	    	for(int i=0 ; i<position-1; i++){
	    		current = current.next;
	    	}
	    	
	    	current.next = current.next.next;
	    	return head;

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {

	        SinglyLinkedList llist = new SinglyLinkedList();

	        int llistCount = scanner.nextInt();

	        for (int i = 0; i < llistCount; i++) {
	            int llistItem = scanner.nextInt();

	            llist.insertNode(llistItem);
	        }

	        int position = scanner.nextInt();

	        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);

	        printSinglyLinkedList(llist1);


	        scanner.close();
	    }
	}
