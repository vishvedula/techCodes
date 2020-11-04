/*
Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false

Example 2:

Input: 1->2->2->1
Output: true

Follow up:
Could you do it in O(n) time and O(1) space?
*/

import java.lang.StringBuffer;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
       if(head == null || head.next == null){
           return true;
       } 
        Stack<Integer> stack = new Stack<Integer>();
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        while(slow !=null) {
           int x =  stack.pop();
            if(x != slow.val) {
                return false;
            }
            slow = slow.next;
        }
       
        
      return true;
    }
}
