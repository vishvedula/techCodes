import java.util.ArrayList;
import java.util.List;

/**
If input contains 1-4-6-5-6
remove all elements larger than the given input , ex: 5
output: 1-4-5
*/
public class DeleteLargerElementsLinkedList {
	public static void main(String args[]) {
		DeleteLargerElementsLinkedListNode root = new DeleteLargerElementsLinkedListNode(1);
		root.next = new DeleteLargerElementsLinkedListNode(6);
		root.next.next = new DeleteLargerElementsLinkedListNode(4);
		root.next.next.next = new DeleteLargerElementsLinkedListNode(6);
		root.next.next.next.next = new DeleteLargerElementsLinkedListNode(5);
		deleteLargerElement(root, 5);
	}

	private static void deleteLargerElement(DeleteLargerElementsLinkedListNode root, int data) {
		List aList = new ArrayList<>();
		while (root != null) {
			if(root.data <= data){
				aList.add(root.data);
			}
			root = root.next;
		}
		System.out.println("Post removing the larger elements,  the LinkedList is:" +aList);
	}
}

class DeleteLargerElementsLinkedListNode {

	DeleteLargerElementsLinkedListNode next;
	int data;

	DeleteLargerElementsLinkedListNode(int data) {
		this.data = data;
		next = null;
	}
}