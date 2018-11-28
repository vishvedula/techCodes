/*
 * You’re given the pointer to the head node of a linked list and a specific position. 
 * Counting backwards from the tail node of the linked list, get the value of the node at the given position.
 *  A position of 0 corresponds to the tail, 1 corresponds to the node before the tail and so on.

Input Format

You have to complete the int getNode(SinglyLinkedListNode* head, int positionFromTail) method which takes two arguments - 
the head of the linked list and the position of the node from the tail. positionFromTail will be at least 0 and less than the number of nodes in the list. You should NOT read any input from stdin/console.

The first line will contain an integer
, the number of test cases.
Each test case has the following format:
The first line contains an integer , the number of elements in the linked list.
The next lines contains, an element each denoting the element of the linked list.
The last line contains an integer

denoting the position from the tail, whose value needs to be found out and returned.

Constraints

, where is the
element of the linked list.

Output Format

Find the node at the given position counting backwards from the tail. 
Then return the data contained in this node. Do NOT print anything to stdout/console.

The code in the editor handles output.
For each test case, print the value of the node, each in a new line.

Sample Input

2
1
1
0
3
3
2
1
2

Sample Output

1
3

Explanation

In first case, there is one element in linked list with value 1. Hence, last element is 1.

In second case, there are 3 elements with values 3, 2 and 1 (3 -> 2 -> 1). Hence, element with position of 2 from tail is 3.
 */
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

	public class GetNodeValueLinkedList {

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

	    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
	        while (node != null) {
	            bufferedWriter.write(String.valueOf(node.data));

	            node = node.next;

	            if (node != null) {
	                bufferedWriter.write(sep);
	            }
	        }
	    }

	    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
	    	SinglyLinkedListNode newNode = null;
	    	SinglyLinkedListNode prevNode = null;
	    	SinglyLinkedListNode currentNode = head;
	    	
	    	// Reversing the list and printing the required index
	    	while(currentNode!=null){
	    		newNode = currentNode.next;
	    		currentNode.next = prevNode;
	    		prevNode = currentNode;
	    		currentNode = newNode;
	    	}
	    	
	    	head = prevNode;
	    	int i=0;
	    	while(i<positionFromTail){
	    		i++;
	    		head= head.next;
	    	}
	    	System.out.println(head.data);
	    	return (int)head.data;

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {

	        int tests = scanner.nextInt();

	        for (int testsItr = 0; testsItr < tests; testsItr++) {
	            SinglyLinkedList llist = new SinglyLinkedList();

	            int llistCount = scanner.nextInt();

	            for (int i = 0; i < llistCount; i++) {
	                int llistItem = scanner.nextInt();

	                llist.insertNode(llistItem);
	            }

	            int position = scanner.nextInt();

	            int result = getNode(llist.head, position);

	        }


	        scanner.close();
	    }
	}
