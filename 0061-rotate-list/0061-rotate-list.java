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
    public ListNode rotate(ListNode head){
        ListNode pptr = head;
        ListNode ptr = head;
        while(ptr.next != null){
            pptr = ptr;
            ptr = ptr.next;
        }
        ptr.next = head;
        head = ptr;
        pptr.next = null;
        return head;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
        return null;
        int c = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            c++;
        }
        c = k%c;
        if(c == 0){
            return head;
        }
        int count = 0;
        while(count < c){
            head = rotate(head);
            count++;
        }
        return head;
    }
}