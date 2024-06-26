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
    public void inorder(TreeNode root,ArrayList<Integer> arr){
        if(root == null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }

    public TreeNode solve(ArrayList<Integer> arr, int min,int max){
        if(min > max) return null;
        int mid = min + (max-min)/2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = solve(arr,min,mid-1);
        root.right = solve(arr,mid+1,max);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        TreeNode r = solve(arr,0,arr.size()-1);
        return r; 

    }
}