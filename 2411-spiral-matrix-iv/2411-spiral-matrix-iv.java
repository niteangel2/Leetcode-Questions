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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] A = new int[m][n];
        for (int[] row : A) {
            Arrays.fill(row, -1);
        }
      int startingRow = 0;
	    int endingRow = m-1;
	    int startingCol = 0;
	    int endingCol = n-1;
	    int total = m*n;
	    int count = 0;
        ListNode temp = head;
	    while( count < total && temp != null ) {
	        //starting wali row ko add karenge
	        for(int i = startingCol; temp != null && count < total && i <= endingCol;i++) {
	            int x = temp.val;
	            count++;
	            A[startingRow][i] = x;
              temp = temp.next;
	        }
	        startingRow++;
	        //ending wala col ko add karenge
	        for(int i = startingRow; temp != null && count < total && i <=  endingRow;i++) {
	            int x = temp.val;
	            count++;
	            A[i][endingCol] = x;
              temp = temp.next;
	        }
	        endingCol--;
	        //ending wali row ko add karenge
	        for(int i = endingCol; temp != null && count < total && i >= startingCol;i--) {
	            int x = temp.val;
	            count++;
	            A[endingRow][i] = x;
                temp = temp.next;	
	        }
	        endingRow--;
	        //starting wale col ko add karenge
	        for(int i = endingRow;temp != null && count < total && i >= startingRow;i--) {
	            int x = temp.val;
	            count++;
	            A[i][startingCol] = x;
              temp = temp.next;			
	        }
	        startingCol++;
	    }
        return A;
    }
}