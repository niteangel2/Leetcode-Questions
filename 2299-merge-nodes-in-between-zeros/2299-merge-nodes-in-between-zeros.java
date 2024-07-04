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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode newHead = new ListNode(-1);
        ListNode newTemp = newHead;
        int s = 0; 
        while(temp != null){
            if(temp.val == 0){
                ListNode sum = new ListNode(s);
                newTemp.next = sum;
                newTemp = newTemp.next;
                s = 0;
            }
            if(temp.val != 0){
                s = s + temp.val;
            }
            temp = temp.next;
        }
        return newHead.next;
    }
}