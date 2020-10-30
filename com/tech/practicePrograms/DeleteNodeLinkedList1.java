/*
 * Java code to Delete a node from LinkedList
 */
public class DeleteNodeLinkedList {

	public static void main(String args[]) {
		DeleteNodeLinkedListNode root = new DeleteNodeLinkedListNode(1);
		root.next = new DeleteNodeLinkedListNode(2);
		root.next.next = new DeleteNodeLinkedListNode(3);
		root.next.next.next = new DeleteNodeLinkedListNode(4);
		root.next.next.next.next = new DeleteNodeLinkedListNode(5);
		root.next.next.next.next.next = new DeleteNodeLinkedListNode(6);
		deleteNode(root, 3);
	}

	private static void deleteNode(DeleteNodeLinkedListNode root, int data) {
		while (root != null) {
			if (root.data == data) {
				root = root.next;
			} else {
				System.out.println(root.data);
				root = root.next;
			}

		}
	}

}


class DeleteNodeLinkedListNode {
	DeleteNodeLinkedListNode next;
	int data;

	DeleteNodeLinkedListNode(int data) {
		this.data = data;
		next = null;
	}
}
