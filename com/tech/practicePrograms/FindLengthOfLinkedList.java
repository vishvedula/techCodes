
public class FindLengthOfLinkedList {

	public static void main(String args[]) {

		FindNthToLastLinkedListNode root = new FindNthToLastLinkedListNode(1);
		root.next = new FindNthToLastLinkedListNode(2);
		root.next.next = new FindNthToLastLinkedListNode(3);
		root.next.next.next = new FindNthToLastLinkedListNode(4);
		root.next.next.next.next = new FindNthToLastLinkedListNode(5);
		printKthToLast(root);
	}

	static void printKthToLast(FindNthToLastLinkedListNode root) {
		int counter = 0;
		while(root !=null){
			counter++;
			root = root.next;
			
		}
		System.out.println("Lenght of linked list is :"+ counter);
	}

}

class FindNthToLastLinkedListNode {

	FindNthToLastLinkedListNode next;
	int data;

	FindNthToLastLinkedListNode(int data) {
		this.data = data;
		next = null;
	}

}
