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
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null)
            return head;
        if(head.next.next == null)
            return head.next;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null){
            fast = fast.next;
            if(fast != null)
                fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}