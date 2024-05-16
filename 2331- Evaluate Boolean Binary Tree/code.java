/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int eval(TreeNode root) {
        if(root == null){
            return -1;
        }
        int left = eval(root.left);
        int right = eval(root.right);
        if(root.val == 2){
            if(left == 1 || right == 1){
                root.val = 1;
            }
            else{
                root.val = 0;
            }
        }
        else if(root.val == 3){
           if(left == 1 && right == 1){
               root.val = 1;
           }
           else{
               root.val = 0;
           }
        }
        return root.val;
    }
    public boolean evaluateTree(TreeNode root) {
        if(root == null){
            return false;
        }
        int x = eval(root);
        return x == 1;
        
    }
}
