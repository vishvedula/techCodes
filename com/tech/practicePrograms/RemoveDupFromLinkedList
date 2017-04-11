import java.util.Set;
import java.util.HashSet;

public class RemoveDupLinkedList {

	@SuppressWarnings("unused")
	private static RemoveDupLinkedListNode prev;

	public static void main(String args[]) {
		RemoveDupLinkedListNode root = new RemoveDupLinkedListNode(1);
		root.next = new RemoveDupLinkedListNode(6);
		root.next.next = new RemoveDupLinkedListNode(4);
		root.next.next.next = new RemoveDupLinkedListNode(6);
		root.next.next.next.next = new RemoveDupLinkedListNode(5);
		removeDuplicatesUsingHashSet(root);
		//System.out.println(root);
	}

	private static void removeDuplicatesUsingHashSet(RemoveDupLinkedListNode root) {
		prev = null;
		Set<Integer> hashSet = new HashSet<Integer>();
		while (root != null && root.next != null) {
			if (hashSet.contains(root.data)) {
				hashSet.add(root.data);
				root = root.next;
			} else {
				hashSet.add(root.data);
				prev = root;
			}
			System.out.println(root.data);
			root = root.next;
		}

	}

}

class RemoveDupLinkedListNode {

	RemoveDupLinkedListNode next;
	int data;

	RemoveDupLinkedListNode(int data) {
		this.data = data;
		next = null;
	}
}
