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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return new int[]{-1,-1};
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head.next;
        ListNode prev = head;
        ListNode temp = head.next.next;
        int cnt = 1;
        while(temp != null) {
            cnt++;
            if(curr.val < prev.val && curr.val < temp.val) {
                arr.add(cnt);
            }
            else if(curr.val > prev.val && curr.val > temp.val) {
                arr.add(cnt);
            }
            prev = curr;
            curr = temp;
            temp = temp.next;
        }
        if(arr.size() < 2) return new int[]{-1,-1};
        int[] res = new int[2];
        res[0] = Integer.MAX_VALUE;
        for(int i = 1; i < arr.size();i++) {
            int m = arr.get(i)- arr.get(i-1);
            res[0] = Math.min(m,res[0]);
        }
        res[1] = arr.get(arr.size()-1) - arr.get(0);
        //System.out.println(arr);
        return res;
        
    }
}