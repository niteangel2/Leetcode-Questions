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
    boolean flag = false;
    public void path(TreeNode root,int key,ArrayList<Integer> arr) {
        if(root == null) {
            return;
        }
        arr.add(root.val);
        if(root.left == null && root.right == null) {
            int sum = 0;
            for(int i = 0; i < arr.size();i++) {
                sum += arr.get(i);
            }
            if(sum == key) {
                flag = true;
                return;
            }
        }
        else{
            path(root.left,key,arr);
            path(root.right,key,arr);
        }
        arr.remove(arr.size()-1);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        ArrayList<Integer> arr = new ArrayList<>();
        path(root,targetSum,arr);
        return flag;
    }
}