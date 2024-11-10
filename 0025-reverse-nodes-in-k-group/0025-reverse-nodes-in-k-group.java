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
     int countAll = 0;
    public ListNode reverseK(ListNode head,int k,int count) {
        int c = 0;
        ListNode curr = head;
        ListNode next = null, prev = null;
        while(curr != null && c < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            countAll++;
            c++;
        } 
        if(next != null && countAll < count ){
            head.next = reverseK(next,k,count);
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
         int count = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        int diff = count % k;
        count = count-diff;
        temp = head;
        int c = 1;
        while(temp != null && c <= count) {
           // System.out.print(temp.val);
            temp = temp.next;
            c++;
        }
   
        ListNode t = reverseK(head,k,count);
        ListNode temp2 = t;
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        temp2.next = temp;
        return t;
    }
}