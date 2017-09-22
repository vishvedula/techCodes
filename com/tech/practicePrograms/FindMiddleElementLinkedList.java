/*
Given a singly linked list, find middle of the linked list. 
For example, if given linked list is 1->2->3->4->5 then output should be 3. 

If there are even nodes, then there would be two middle nodes, 
we need to print second middle element. For example, if given linked list is 1->2->3->4->5->6 then output should be 4.
*/

import java.util.HashMap;
import java.util.Map;


class FindLinkedList {
	
	FindLinkedList next;
	int data;
	
	FindLinkedList(int data){
		this.data= data;
		 this.next = null;
	}
}

public class FindMiddleElementLinkedList {
	
	public static void main(String args[]){
		FindLinkedList root = new FindLinkedList(1);
		root.next = new FindLinkedList(2);
		root.next.next = new FindLinkedList(3);
		root.next.next.next = new FindLinkedList(4);
		root.next.next.next.next = new FindLinkedList(5);
		root.next.next.next.next.next = new FindLinkedList(6);
		root.next.next.next.next.next.next = new FindLinkedList(7);
		root.next.next.next.next.next.next.next = new FindLinkedList(8);
		findMiddle(root);
	}

	private static void findMiddle(FindLinkedList root) {
		int index =0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		while(root!=null){
			map.put(index, root.data);
			System.out.println(root.data);
			root = root.next;
			index++;
		}
		int remainder = map.size()/2;
		System.out.println("\n"+"map size is :" +map.size()+" & "+ "remainder: "+ remainder);
			System.out.println("Middle element is :"+ map.get(remainder));
	}
	
}


