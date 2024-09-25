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
    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;
    }
    public int pairSum(ListNode head) {
        int m = 0;
        ListNode mid = findMid(head);
      //  System.out.println(mid.val);
        ListNode secondHead = reverse(mid.next);
        ListNode firstHead = head;
        while(secondHead != null){
            int x = firstHead.val + secondHead.val;
           // System.out.println(x);
            m = Math.max(m, x);
            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }
        return m;
    }
}