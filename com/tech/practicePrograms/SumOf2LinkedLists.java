
/*Input:
  First List: 5->6->3  // represents number 563
  Second List: 8->4->2 //  represents number 842
Output
  Resultant list: 1->4->0->5  // represents number 1405
*/

public class SumOf2LinkedLists {

	public static void main(String args[]) {
		LinkedListNode node = new LinkedListNode(5);
		node.next = new LinkedListNode(6);
		node.next.next = new LinkedListNode(3);

		LinkedListNode node2 = new LinkedListNode(8);
		node2.next = new LinkedListNode(4);
		node2.next.next = new LinkedListNode(2);

		printNodes(node, node2);
	}

	static void printNodes(LinkedListNode node , LinkedListNode node2) {
		StringBuffer strBuf = new StringBuffer();
		StringBuffer strBuf2 = new StringBuffer();
			while(node!=null){
				strBuf.append(node.data);
				node= node.next;
			}
			
			while(node2!=null){
				strBuf2.append(node2.data);
				node2= node2.next;
			}
			System.out.println(strBuf);
			System.out.println(strBuf2);
			System.out.println("Sum of given 2 LinkedLists is :");
			System.out.println(Integer.parseInt(strBuf.toString())+ Integer.parseInt(strBuf2.toString()));
	}

}
// Create an inner class Node

class LinkedListNode {
	int data;
	LinkedListNode next;

	LinkedListNode(int data) {
		this.data = data;
		next = null;
	}
}
