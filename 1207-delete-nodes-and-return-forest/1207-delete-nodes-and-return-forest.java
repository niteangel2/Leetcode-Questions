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
    private TreeNode delete(TreeNode root, Set<Integer> set,List<TreeNode> res) {
        if(root == null) return null;
        root.left = delete(root.left,set,res);
        root.right = delete(root.right,set,res);

        if(set.contains(root.val)) {
            if(root.left != null) {
                res.add(root.left);
            }
            if(root.right != null) {
                res.add(root.right);
            }
            return null;
        }
        else{
            return root;
        }
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i : to_delete) { 
            set.add(i);
        }
        TreeNode ans = delete(root, set, res);
        if(ans != null)
        res.add(ans);
        return res;
    }
}